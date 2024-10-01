import org.example.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class TestStringUtils
{
    @Test
    void TestStringUtils()
    {
        assertTrue(StringUtils.isPositiveNumber("3"));
        assertTrue(StringUtils.isPositiveNumber("3.5"));
        assertTrue(StringUtils.isPositiveNumber("17"));
        assertFalse(StringUtils.isPositiveNumber("0"));
        assertFalse(StringUtils.isPositiveNumber("-1"));
        assertFalse(StringUtils.isPositiveNumber("-3.14"));
        assertFalse(StringUtils.isPositiveNumber("abc"));
        assertFalse(StringUtils.isPositiveNumber(null));
    }
}