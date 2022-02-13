package Com.accenture.tetcase;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PalindromeCheckerTest{

    @Test
    public void shouldRecognizeNull() {
        assertEquals(false, PalindromeCheckerTest.isPalindrome(null));
    }

    @Test
    public void shouldRecognizeEmptyString() {
        assertEquals(true,PalindromeCheckerTest.isPalindrome(""));
    }

    @Test
    public void shouldRecognizeOneCharacterPalindrome() {
        assertEquals(true,PalindromeCheckerTest.isPalindrome("a"));
    }

    @Test
    public void shouldRecognizeTwoCharacterPalindrome() {
        assertEquals(true,PalindromeCheckerTest.isPalindrome("aa"));
    }

    @Test
    public void shouldRecognizeTwoCharacterNonPalindrome() {
        assertEquals(false, PalindromeCheckerTest.isPalindrome("ab"));
    }

    @Test
    public void shouldRecognizePalindrome() {
        assertEquals(true, PalindromeCheckerTest.isPalindrome("amanaplanacanalpanama"));
    }

    @Test
    public void shouldRecognizeNonPalindrome() {
        assertEquals(false, PalindromeCheckerTest.isPalindrome("noPalindrome"));
    }

    public static boolean isPalindrome(String word) {
        if (word == null) {
            // assuming a null value is no palindrome
            return false;
        } else if (word.length() < 2) {
            // assuming both "" and "x" are palindromes
            return true;
        } else {
            // a word is a palindrome if it starts and ends in the same letter..
            if (!word.endsWith(word.substring(0, 1))) {
                return false;
            }
            // .. and everything in between the first and the last letter is a palindrome
            return isPalindrome(word.substring(1, word.length() - 1));
        }
    }
}

