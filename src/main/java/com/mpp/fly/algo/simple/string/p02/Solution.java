package com.mpp.fly.algo.simple.string.p02;

public class Solution {

    public int reverse(int x) {
        int target = 0;
        while (x != 0){
            // 最后一位数
            int reverseNum = x % 10;
            x /= 10;
            if (target > Integer.MAX_VALUE / 10 || (target == Integer.MAX_VALUE / 10 && reverseNum > 7)){
                return 0;
            }
            if (target < Integer.MIN_VALUE / 10 || (target == Integer.MIN_VALUE / 10 && reverseNum < -8)){
                return 0;
            }
            target = target * 10 + reverseNum;
        }
        return target;
    }


}
