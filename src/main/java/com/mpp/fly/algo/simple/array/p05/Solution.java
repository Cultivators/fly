package com.mpp.fly.algo.simple.array.p05;

/**
 * 任何数和 00 做异或运算，结果仍然是原来的数，即 a⊕0=a。
 * 任何数和其自身做异或运算，结果是 0，即 a⊕a=0。
 * 异或运算满足交换律和结合律，即 a⊕b⊕a=b⊕a⊕a=b⊕(a⊕a)=b⊕0=b。
 */
public class Solution {

    public int singleNumber(int[] nums) {
        int singleNumber = 0;
        for (int num : nums){
            singleNumber ^= num;
        }
        return singleNumber;
    }

}
