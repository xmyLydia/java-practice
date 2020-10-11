package UnitTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * @author mingyux
 */
@RunWith(value = Parameterized.class)
public class ParameterizedTest {
    String input;
    String expected;
    Challenge challenge;

    public ParameterizedTest(String input, String expected) {
        this.challenge = new Challenge();
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { "ABCDEFF", "ABCDEF" }, { "AB88EFFG", "AB8EFG" },
                { "112233445566", "123456" }, { "ZYZQQB", "ZYZQB" }
        });
    }

    @Test
    public void parameterized_test() {
        String result = challenge.removePairs(input);
        assertEquals(result, expected);
    }
}
