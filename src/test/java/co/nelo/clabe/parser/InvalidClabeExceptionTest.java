package co.nelo.clabe.parser;

import org.junit.Test;

public class InvalidClabeExceptionTest {
    @Test(expected = InvalidClabeException.class)
    public void throwsException() throws InvalidClabeException {
        throw new InvalidClabeException("invalid clabe");
    }
}
