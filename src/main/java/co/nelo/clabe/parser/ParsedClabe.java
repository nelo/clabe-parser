package co.nelo.clabe.parser;

public class ParsedClabe {
    String bankCode;
    String branchOfficeCode;
    String accountNumber;
    char controlDigit;
    SpeiInstitution institution;

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
}
