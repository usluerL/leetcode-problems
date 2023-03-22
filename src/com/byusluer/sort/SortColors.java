package com.byusluer.sort;


import java.util.Arrays;

/**
 * LeetCode URL:https://leetcode.com/problems/sort-colors/description/
 * Difficulty: Medium
 * Hint:  two pointers one walker, switch 0's to left, 2's right if switch right stop i)
 */
public class SortColors {

    public void sortColors(int[] nums) {
        int len = nums.length;
        if (len == 1) return;
        int left = 0;
        int right = len - 1;
        int i = 0;

        while (i <= right) {
            int val = nums[i];
           if (val == 0){
               swap(nums,left,i);
               left++;
           }else if (val ==2){
               swap(nums,i,right);
               if (nums [i] == 2 || nums[i] == 1) i--;
               right--;
           }

           i++;
        }

        System.out.println(Arrays.toString(nums));

    }


    void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    public static void main(String[] args) {
        int [] flag1 = {0};
        int [] flag2 = {2,0,1,0,2};
        int [] flag3 = {0,0,1,2,2};
        int [] flag4 = {1,1,1,1,1};
        int [] flag5 = {0,2,1,0,2,0,2};


        SortColors pr = new SortColors();
        pr.sortColors(flag1);
        pr.sortColors(flag2);
        pr.sortColors(flag3);
        pr.sortColors(flag4);
        pr.sortColors(flag5);
    }
}
