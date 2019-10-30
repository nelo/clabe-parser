package co.nelo.clabe.parser;

import java.util.Objects;

public class ParsedClabe {
    private final String bankCode;
    private final String branchOfficeCode;
    private final String accountNumber;
    private final char controlDigit;
    private final SpeiInstitution institution;

    protected ParsedClabe(
            String bankCode,
            String branchOfficeCode,
            String accountNumber,
            char controlDigit,
            SpeiInstitution institution
    ) {
        this.bankCode = bankCode;
        this.branchOfficeCode = branchOfficeCode;
        this.accountNumber = accountNumber;
        this.controlDigit = controlDigit;
        this.institution = institution;
    }

    public String getBankCode() {
        return bankCode;
    }

    public String getBranchOfficeCode() {
        return branchOfficeCode;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public char getControlDigit() {
        return controlDigit;
    }

    public SpeiInstitution getInstitution() {
        return institution;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ParsedClabe that = (ParsedClabe) object;
        return controlDigit == that.getControlDigit() &&
                bankCode.equals(that.getBankCode()) &&
                branchOfficeCode.equals(that.getBranchOfficeCode()) &&
                accountNumber.equals(that.getAccountNumber()) &&
                institution.equals(that.getInstitution());
    }

    @Override
    public int hashCode() {
        return Objects.hash(bankCode, branchOfficeCode, accountNumber, controlDigit, institution);
    }
}
