package palindrome;

import org.junit.Test;

import static org.junit.Assert.*;


public class PalindromeTest {

    @Test
    public void testIsPalindrome() throws Exception {
        assertEquals(true, Palindrome.isPalindrome("1"));
        assertEquals(true, Palindrome.isPalindrome("11"));
        assertEquals(true, Palindrome.isPalindrome("121"));
        assertEquals(true, Palindrome.isPalindrome("1221"));
        assertEquals(true, Palindrome.isPalindrome("12321"));
        assertEquals(true, Palindrome.isPalindrome("12344321"));
        assertEquals(true, Palindrome.isPalindrome("123454321"));

        assertEquals(false, Palindrome.isPalindrome("12"));
        assertEquals(false, Palindrome.isPalindrome("112"));
        assertEquals(false, Palindrome.isPalindrome("1212"));
    }
}