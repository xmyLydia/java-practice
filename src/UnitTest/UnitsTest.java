package UnitTest;

import org.junit.Test;

import static org.junit.Assert.*;

public class UnitsTest {

    @Test
    public void everyNthChar() {
    }

    @Test
    public void removePairs() {
        Challenge challenge = new Challenge();
        String result1 = challenge.removePairs("AABCDDEFF");
        String expected1 = "ABCDEF";
        assertEquals(result1, expected1);

        String result2 = challenge.removePairs("ABCCABDEEF");
        String expected2 = "ABCABDEF";
        assertEquals(result2, expected2);
    }

    @Test
    public void converter() {
    }

    @Test
    public void nullIfOddLength() {
    }
}