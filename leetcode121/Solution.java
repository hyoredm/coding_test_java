package leetcode121;

public class Solution {
    public int maxProfit(int[] prices) {
        int temp = 0;
        int current = prices[0];
        int maxProfit = 0;
        for(int i=1; i < prices.length; i++){
            temp = prices[i] - current;
            if(temp < 0){
                current = prices[i];
            }
            else {
                maxProfit = Math.max(maxProfit, temp);
            }
        }
        return maxProfit;
    }
}
