package com.mpp.fly.algo.simple.array.p01;

public class Solution {

    public static int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 1; i < nums.length; i++){
            if (nums[j] != nums[i]){
                nums[++j] = nums[i];
            }
        }
        return j+1;
    }
}
