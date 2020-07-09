package com.mpp.fly.algo.simple.array.p03;

public class Soulution {

    /** 这个有点暴力 时间复杂度为：O(k * n)
     * public void rotate(int[] nums, int k) {
        int len = nums.length;
        int cycle = k;
        if (cycle > len){
            cycle = k % len;
        }
        for (int i = 0; i < cycle; i++) {
            int tmp = nums[len - 1];
            for (int j = len - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = tmp;
        }

    }*/

    /**
     * 原始数组                  : 1 2 3 4 5 6 7
     * 反转所有数字后             : 7 6 5 4 3 2 1
     * 反转前 k 个数字后          : 5 6 7 4 3 2 1
     * 反转后 n-k 个数字后        : 5 6 7 1 2 3 4 --> 结果
     *
     * @param nums
     * @param k
     */
    public void rotate(int[] nums, int k){
        int len = nums.length;
        k = k % len;
        reserve(nums, 0, len - 1);
        reserve(nums, 0, k - 1);
        reserve(nums, k, len - 1);

    }

    private void reserve(int[] nums, int start, int end){
        while (end > start){
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            end--;
            start++;
        }

    }

}
