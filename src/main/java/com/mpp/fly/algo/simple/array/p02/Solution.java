package com.mpp.fly.algo.simple.array.p02;

//贪心算法
public class Solution {

    public int maxProfit(int[] prices) {
        //只要i+1天的股票价格大于i天的价格，则进行交易。只管当前的收益最大。
        int maxProfit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            int diffProfit = prices[i + 1] - prices[i];
            if (diffProfit > 0){
                maxProfit += diffProfit;
            }
        }
        return maxProfit;
    }
}
