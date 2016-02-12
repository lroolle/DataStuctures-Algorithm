package Strings;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author Eric Wang <wrqatw@gmail.com>.
 */

public class StringsTest {

    private static final String str1 = "abcABC";
    private static final String expected1 = "CBAcba";
    private static final String str2 = "我爱你";
    private static final String expected2 = "你爱我";
    private static final String str3 = "abc ABC";
    private static final String expected3 = "ABC abc";
    private static final String str4 = "我爱 你";
    private static final String expected4 = "你 我爱";

    @Test
    public void testStrExample() throws Exception {
    }

    @Test
    public void testEnReverseWithStringConcat() throws Exception {
        assertEquals(expected1, Strings.reverseWithStringConcat(str1));
    }

    @Test
    public void testChReverseWithStringConcat() throws Exception {
        assertEquals(expected2, Strings.reverseWithStringConcat(str2));
    }

    @Test
    public void testEnReverseWithStringBuilder() throws Exception {
        assertEquals(expected1, Strings.reverseWithStringBuilder(str1));
    }

    @Test
    public void testChReverseWithStringBuilder() throws Exception {
        assertEquals(expected2, Strings.reverseWithStringBuilder(str2));
    }

    @Test
    public void testEnReverseWithStringBuilderBuiltinMethod() throws Exception {
        assertEquals(expected1, Strings.reverseWithStringBuilderBuiltinMethod(str1));
    }

    @Test
    public void testChReverseWithStringBuilderBuiltinMethod() throws Exception {
        assertEquals(expected2, Strings.reverseWithStringBuilderBuiltinMethod(str2));
    }

    @Test
    public void testEnReverseWithSwaps() throws Exception {
        assertEquals(expected1, Strings.reverseWithSwaps(str1));
    }

    @Test
    public void testChReverseWithSwaps() throws Exception {
        assertEquals(expected2, Strings.reverseWithSwaps(str2));
    }

    @Test
    public void testEnReverseWithXOR() throws Exception {
        assertEquals(expected1, Strings.reverseWithXOR(str1));
    }

    @Test
    public void testChReverseWithXOR() throws Exception {
        assertEquals(expected2, Strings.reverseWithXOR(str2));
    }

    @Test
    public void testEnReverseWordsByCharWithAdditionalStorage() throws Exception {
        assertEquals(expected3, Strings.reverseWordsByCharWithAdditionalStorage(str3));
    }

    @Test
    public void testChReverseWordsByCharWithAdditionalStorage() throws Exception {
        assertEquals(expected4, Strings.reverseWordsByCharWithAdditionalStorage(str4));
    }

    @Test
    public void testEnReverseWordsUsingStringTokenizerWithAdditionalStorage() throws Exception {
        assertEquals(expected3, Strings.reverseWordsUsingStringTokenizerWithAdditionalStorage(str3));
    }

    @Test
    public void testChReverseWordsUsingStringTokenizerWithAdditionalStorage() throws Exception {
        assertEquals(expected4, Strings.reverseWordsUsingStringTokenizerWithAdditionalStorage(str4));
    }

    @Test
    public void testEnReverseWordsUsingSplitWithAdditionalStorage() throws Exception {
       assertEquals(expected3, Strings.reverseWordsUsingSplitWithAdditionalStorage(str3));
    }

    @Test
    public void testChReverseWordsUsingSplitWithAdditionalStorage() throws Exception {
        assertEquals(expected4, Strings.reverseWordsUsingSplitWithAdditionalStorage(str4));
    }

    @Test
    public void testEnReverseWordsInPlace() throws Exception {
        assertEquals(expected3, Strings.reverseWordsInPlace(str3));
    }

    @Test
    public void testChReverseWordsInPlace() throws Exception {
        assertEquals(expected4, Strings.reverseWordsInPlace(str4));

    }

    @Test
    public void testIsPalindrome() {
        String string = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        boolean result = Strings.isPalindromeWithAdditionalStorage(string);
        assertFalse("Is Palindrome With Additional Storage error. expected=false got="+result, result);

        result = Strings.isPalindromeInPlace(string);
        assertFalse("Is Palindrome In Place error. expected=false got="+result, result);

        string = "ABCDEFGHIJKKJIHGFEDCBA";
        result = Strings.isPalindromeWithAdditionalStorage(string);
        assertTrue("Is Palindrome With Additional Storage error. expected=true got="+result, result);

        result = Strings.isPalindromeInPlace(string);
        assertTrue("Is Palindrome In Place error. expected=true got="+result, result);
    }

    @Test
    public void testGenerateSubSets() {
        // COMBINATIONS
        String string = "abc";
        String[] check = new String[] {"", "c", "b", "cb", "a", "ca", "ba", "cba"};
        String[] result = Strings.generateSubsets(string);
        assertTrue("Generate Subsets error. expected="+print(check)+" got="+print(result), Arrays.equals(check, result));
    }

    @Test
    public void testEditDistance() {
        // Edit Distance
        String string1 = "kitten";
        String string2 = "sitting";
        int check = 3;
        int result = Strings.levenshteinDistance(string1, string2);
        assertTrue("Edit Distance error. expected="+check+" got="+result, (check==result));
    }

    @Test
    public void testPermutation1() {
        final String string = "abc";
        final String[] list = Strings.permutations(string);
        Assert.assertTrue(list[0].equals("abc"));
        Assert.assertTrue(list[5].equals("cba"));
    }

    @Test
    public void testPermutation2() {
        final String string = "abcd";
        final String[] list = Strings.permutations(string);
        Assert.assertTrue(list[0].equals("abcd"));
        Assert.assertTrue(list[5].equals("adcb"));
        Assert.assertTrue(list[11].equals("bdca"));
        Assert.assertTrue(list[17].equals("cdba"));
        Assert.assertTrue(list[23].equals("dcba"));
    }

    private static final String print(String[] strings) {
        StringBuilder builder = new StringBuilder();
        for (String s : strings)
            builder.append(s).append(' ');
        return builder.toString();
    }
}