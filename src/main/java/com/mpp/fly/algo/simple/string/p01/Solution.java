package com.mpp.fly.algo.simple.string.p01;

public class Solution {

    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        while (start < end){
            char tmp = s[start];
            s[start++] = s[end];
            s[end--] = tmp;
        }

    }
}
