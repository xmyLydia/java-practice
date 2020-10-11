package UnitTest;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mingyux
 */
public class UnitsTest {

    Challenge challenge;

    @Before
    public void setUp() {
        challenge = new Challenge();
    }
    @Test
    public void everyNthChar() {
       // Challenge challenge = new Challenge();
        char[] arr = new char[]{'h', 'e', 'l', 'l', 'o'};
        char[] expectedArr = new char[]{'e', 'l'};
        char[] result = challenge.everyNthChar(arr, 2);
        assertArrayEquals(expectedArr, result);
        assertArrayEquals(arr, challenge.everyNthChar(arr, 10));
    }

    @Test
    public void removePairs() {
       // Challenge challenge = new Challenge();
        String result1 = challenge.removePairs("AABCDDEFF");
        String expected1 = "ABCDEF";
        assertEquals(result1, expected1);

        String result2 = challenge.removePairs("ABCCABDEEF");
        String expected2 = "ABCABDEF";
        assertEquals(result2, expected2);

        assertNull("tested null", null);
        assertEquals("A", challenge.removePairs("A"));
        assertEquals("", challenge.removePairs(""));
    }

    @Test
    public void converter() {
       // Challenge challenge = new Challenge();
        assertEquals(300, challenge.converter(10, 5));
    }

    @Test(expected = ArithmeticException.class)
    public void whenExceptionThrown_converter() {
    //    Challenge challenge = new Challenge();
        challenge.converter(10, 0);
    }

    @Test
    public void nullIfOddLength() {
     //   Challenge challenge = new Challenge();
        assertNull(challenge.nullIfOddLength("Imk"));
        assertEquals("Im", challenge.nullIfOddLength("Im"));
    }
}