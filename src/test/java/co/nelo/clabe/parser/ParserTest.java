package co.nelo.clabe.parser;

import org.junit.Assert;
import org.junit.Test;

import static co.nelo.clabe.parser.ParsedClabeFixtures.testParsedClabe1;

public class ParserTest {
    @Test
    public void testIsValid_ReturnsFalse_TooShort() {
        Parser parser = new Parser();

        boolean isValid = parser.isValid("12345678901234567");

        Assert.assertFalse(isValid);
    }

    @Test
    public void testIsValid_ReturnsFalse_TooLong() {
        Parser parser = new Parser();

        boolean isValid = parser.isValid("1234567890123456789");

        Assert.assertFalse(isValid);
    }

    @Test
    public void testIsValid_ReturnsFalse_InstitutionInvalid() {
        Parser parser = new Parser();

        boolean isValid = parser.isValid("000010077777777771");

        Assert.assertFalse(isValid);
    }

    @Test
    public void testIsValid_ReturnsTrue() {
        Parser parser = new Parser();

        boolean isValid = parser.isValid("002010077777777771");

        Assert.assertTrue(isValid);
    }

    @Test
    public void testIsPartiallyValid_ReturnsFalse_TooShort() {
        Parser parser = new Parser();

        boolean isValid = parser.isPartiallyValid("00");

        Assert.assertFalse(isValid);
    }

    @Test
    public void testIsPartiallyValid_ReturnsFalse_InstitutionInvalid() {
        Parser parser = new Parser();

        boolean isValid = parser.isPartiallyValid("000");

        Assert.assertFalse(isValid);
    }

    @Test(expected = InvalidClabeException.class)
    public void testParse_ThrowsException() throws InvalidClabeException {
        Parser parser = new Parser();

        parser.parse("002010077777777772");
    }

    @Test
    public void testParse() throws InvalidClabeException {
        Parser parser = new Parser();

        ParsedClabe parsedClabe = parser.parse("002010077777777771");

        Assert.assertEquals(
                testParsedClabe1(),
                parsedClabe
        );
    }

    @Test
    public void testGetInstitution() {
        Parser parser = new Parser();

        SpeiInstitution institution = parser.getInstitution("00201");

        Assert.assertEquals(
                SpeiInstitution.INSTITUTIONS_MAP.get("002"),
                institution
        );
    }
}
