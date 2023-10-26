package com.mycompany.testunitaireinsset.string;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.Map;
import java.util.TreeMap;


public class StringUtilsTest {

    @Test
    public void testInverse() {
        StringUtils instance = new StringUtils();
        String result = instance.inverse("hello");
        assertEquals("olleh", result);
    }

    @Test
    public void testInverseEmpty() {
        StringUtils instance = new StringUtils();
        String result = instance.inverse("");
        assertEquals("", result);
    }

    @Test
    public void testInverseSingleCharacter() {
        StringUtils instance = new StringUtils();
        String result = instance.inverse("a");
        assertEquals("a", result);
    }

    @Test
    public void testInversePalindrome() {
        StringUtils instance = new StringUtils();
        String result = instance.inverse("racecar");
        assertEquals("racecar", result);
    }

    @Test
    public void testIsPalindromeOK() {
        StringUtils instance = new StringUtils();
        boolean result = instance.isPalindrome("radar");
        assertEquals(true, result);
    }

    @Test
    public void testIsPalindromeNOK() {
        StringUtils instance = new StringUtils();
        boolean result = instance.isPalindrome("hello");
        assertEquals(false, result);
    }

   // @Test
   // public void testIsPalindromeEmpty() {
    /*    StringUtils instance = new StringUtils();
        boolean result = instance.isPalindrome("");
        assertEquals(false, result);
    }*/

    @Test
    public void testIsPalindromePalindrome() {
        StringUtils instance = new StringUtils();
        boolean result = instance.isPalindrome("abccba");
        assertEquals(true, result);
    }

    @Test
    public void testCompterOccurences() {
        StringUtils instance = new StringUtils();
        Map<String, Integer> result = instance.compterOccurences("hello");
        Map<String, Integer> expected = new TreeMap<>();
        expected.put("h", 1);
        expected.put("e", 1);
        expected.put("l", 2);
        expected.put("o", 1);
        assertEquals(expected, result);
    }
}