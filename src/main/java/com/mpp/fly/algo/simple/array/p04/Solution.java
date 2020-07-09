package com.mpp.fly.algo.simple.array.p04;

import java.util.HashSet;
import java.util.Set;

//可以不看  用工具算法没意义
public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);
        for (int num : nums){
            if (!set.add(num)){
                return true;
            }
        }
        return false;
    }
}
