package com.byusluer.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * LeetCode URL: https://leetcode.com/problems/reverse-string/
 * Difficulty: Easy
 * Short Hint: TP start end - t: O(n/2)  s:0(1)
 */
public class ReverseString {

    public void reverseString(char[] s) {
        int len = s.length;
        if (len == 1) {
            System.out.println(s);
            return;
        }
        int left = 0;
        int right = len - 1;
        while (left < right) {
           swap(s,left,right);
           left++;
           right--;
        }

        System.out.println(s);
    }

    void swap(char[] s, int left, int right) {
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
    }





    public static void main(String[] args) {
        ReverseString pr = new ReverseString();
        char [] s  = {'h','e','l','l','o'};
        char [] sOdd = {'h','e','l','l'};
        char [] one = {'h'};

        pr.reverseString(s);
        pr.reverseString(sOdd);
        pr.reverseString(one);

//        pr.reverseString2(s);
//        pr.reverseString2(sOdd);
//        pr.reverseString2(one);


    }


}
