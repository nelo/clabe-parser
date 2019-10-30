package co.nelo.clabe.parser;

import org.junit.Assert;
import org.junit.Test;

public class SpeiInstitutionTest {

    @Test
    public void testEquals_returnsTrue() {
        SpeiInstitution firstInstitution = SpeiInstitution.INSTITUTIONS_MAP.get("002");
        SpeiInstitution secondInstitution = SpeiInstitution.INSTITUTIONS_MAP.get("002");

        Assert.assertTrue(firstInstitution.equals(secondInstitution));
    }

    @Test
    public void testEquals_returnsFalse() {
        SpeiInstitution firstInstitution = SpeiInstitution.INSTITUTIONS_MAP.get("002");
        SpeiInstitution secondInstitution = SpeiInstitution.INSTITUTIONS_MAP.get("006");

        Assert.assertFalse(firstInstitution.equals(secondInstitution));
    }

    @Test
    public void testHashCode_returnsSame() {
        SpeiInstitution firstInstitution = SpeiInstitution.INSTITUTIONS_MAP.get("002");
        SpeiInstitution secondInstitution = SpeiInstitution.INSTITUTIONS_MAP.get("002");

        Assert.assertEquals(firstInstitution.hashCode(), secondInstitution.hashCode());
    }

    @Test
    public void testEquals_returnsDifferent() {
        SpeiInstitution firstInstitution = SpeiInstitution.INSTITUTIONS_MAP.get("002");
        SpeiInstitution secondInstitution = SpeiInstitution.INSTITUTIONS_MAP.get("006");

        Assert.assertNotEquals(firstInstitution.hashCode(), secondInstitution.hashCode());
    }
}
