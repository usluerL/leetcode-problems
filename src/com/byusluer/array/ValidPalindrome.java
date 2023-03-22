package com.byusluer.array;

/**
 * LeetCode URL: https://leetcode.com/problems/valid-palindrome/
 * Difficulty: Easy
 * Hint: clear non alpha via regex. )
 */
public class ValidPalindrome {

    boolean isPalindrome(String s) {
        String alpHaNumeric = clearNonAlphaNumericValues(s).toLowerCase();
        int len = alpHaNumeric.length();
        if (len == 1 || len == 0) return true;
        int left = 0;
        int right = len - 1;

        while (left <= right) {
            if (alpHaNumeric.charAt(left) != alpHaNumeric.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }


    String clearNonAlphaNumericValues(String s) {
        return s.replaceAll("[^a-zA-Z0-9]", "");
    }


    public static void main(String[] args) {


        ValidPalindrome pl = new ValidPalindrome();
        System.out.println(pl.isPalindrome("A man, a plan, a canal: Panama"));
    }
}
