package co.nelo.clabe.parser;

import java.util.regex.Pattern;

public class Parser {
    private static final Pattern CLABE_RGX = Pattern.compile("^\\d{18}$");
    private static final Pattern PARTIAL_CLABE_RGX = Pattern.compile("^\\d{3,17}$");

    public Parser() {}


    public ParsedClabe parse(String clabe) throws InvalidClabeException {
        if (!isValid(clabe)) {
            throw new InvalidClabeException("The given CLABE is not valid");
        }
        String institutionPrefix = getInstitutionPrefix(clabe);
        SpeiInstitution institution = SpeiInstitution.INSTITUTIONS_MAP.get(institutionPrefix);
        return new ParsedClabe(
                institutionPrefix,
                getBranchOfficeCode(clabe),
                getAccountNumber(clabe),
                getControlDigit(clabe),
                institution
        );
    }

    public boolean isValid(String clabe) {
        return CLABE_RGX.matcher(clabe).matches()
                && isInstitutionValid(clabe)
                && getControlDigit(clabe) == calculateControlDigit(clabe);
    }

    public boolean isPartiallyValid(String partialClabe) {
        return PARTIAL_CLABE_RGX.matcher(partialClabe).matches() &&
                isInstitutionValid(partialClabe);
    }

    public SpeiInstitution getInstitution(String clabe) {
        String institutionPrefix = getInstitutionPrefix(clabe);
        return SpeiInstitution.INSTITUTIONS_MAP.get(institutionPrefix);
    }

    private boolean isInstitutionValid(String clabe) {
        String institutionPrefix = getInstitutionPrefix(clabe);
        return SpeiInstitution.INSTITUTIONS_MAP.containsKey(institutionPrefix);
    }

    private String getInstitutionPrefix(String clabe) {
        return clabe.substring(0, 3);
    }

    private String getBranchOfficeCode(String clabe) {
        return clabe.substring(3, 6);
    }

    private String getAccountNumber(String clabe) {
        return clabe.substring(6, 17);
    }

    private char calculateControlDigit(String fullClabe) {
        String clabe = fullClabe.substring(0, 17);
        int[] digitProducts = new int[clabe.length()];
        for (int idx = 0; idx < clabe.length(); idx++) {
            int digit = clabe.charAt(idx);
            int weightFactor = getWeightFactor(idx);
            digitProducts[idx] = (digit * weightFactor) % 10;
        }
        int sumRemainder = sumArray(digitProducts) % 10;
        return Integer.toString((10 - sumRemainder) % 10).charAt(0);
    }

    private char getControlDigit(String clabe) {
        return clabe.charAt(17);
    }

    private int sumArray(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    private int getWeightFactor(int idx) {
        switch (idx % 3) {
            case 0: return 3;
            case 1: return 7;
            default: return 1;
        }
    }
}
