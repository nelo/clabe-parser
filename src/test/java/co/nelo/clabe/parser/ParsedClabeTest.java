package co.nelo.clabe.parser;

import org.junit.Assert;
import org.junit.Test;

import static co.nelo.clabe.parser.ParsedClabeFixtures.testParsedClabe1;
import static co.nelo.clabe.parser.ParsedClabeFixtures.testParsedClabe2;

public class ParsedClabeTest {

    @Test
    public void testEquals_ReturnsTrue() {
        ParsedClabe parsedClabe = testParsedClabe1();
        ParsedClabe otherParsedClabe = testParsedClabe1();
        Assert.assertTrue(parsedClabe.equals(otherParsedClabe));
    }

    @Test
    public void testEquals_ReturnsFalse() {
        ParsedClabe parsedClabe = testParsedClabe1();
        ParsedClabe otherParsedClabe = testParsedClabe2();
        Assert.assertFalse(parsedClabe.equals(otherParsedClabe));
    }

    @Test
    public void testHashCode_Same() {
        ParsedClabe parsedClabe = testParsedClabe1();
        ParsedClabe otherParsedClabe = testParsedClabe1();
        Assert.assertEquals(parsedClabe.hashCode(), otherParsedClabe.hashCode());
    }

    @Test
    public void testHashCode_Different() {
        ParsedClabe parsedClabe = testParsedClabe1();
        ParsedClabe otherParsedClabe = testParsedClabe2();
        Assert.assertNotEquals(parsedClabe.hashCode(), otherParsedClabe.hashCode());
    }
}
