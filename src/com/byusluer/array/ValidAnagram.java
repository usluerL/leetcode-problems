package com.byusluer.array;


import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * LeetCode URL: https://leetcode.com/problems/valid-anagram
 * Difficulty: Easy
 * Short Hint: Counter Table and  (- 'a' idea since every char has an int value)
 */

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        int len = s.length();
        if (len != t.length()) return false;

        int[] counter = new int[26];
        for (int i = 0; i < len; i++) {
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }

        for (int count : counter) {
            if (count != 0) return false;
        }

        return true;
    }


    //for unicode chars

    boolean isAnagramHm(String s, String t) {
        int len = s.length();
        if (len != t.length()) return false;
        Map<Character, Integer> counterMap = new HashMap<>();

        for (int i = 0; i < len; i++) {
            int count = counterMap.getOrDefault(s.charAt(i), 0) + 1;
            counterMap.put(s.charAt(i), count);
            int countMinus = counterMap.getOrDefault(t.charAt(i), 0) - 1;
            counterMap.put(t.charAt(i), countMinus);
        }

        System.out.println(counterMap);

        //todo: note this fancy method.
        return counterMap.values().stream().allMatch(value -> value == 0);
    }


    public static void main(String[] args) {
        ValidAnagram pr = new ValidAnagram();

        System.out.println(pr.isAnagramHm("anagram", "managra"));
    }
}
