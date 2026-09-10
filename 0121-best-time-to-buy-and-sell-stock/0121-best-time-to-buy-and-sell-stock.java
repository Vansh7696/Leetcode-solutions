class Solution {
    public int maxProfit(int[] prices) {
        int maxP = 0;
        int minPrice = prices[0];
        for(int i=1;i<prices.length;i++){
            minPrice = Math.min(minPrice , prices[i]);
            int profit = prices[i] - minPrice;
            maxP = Math.max(maxP,profit);
        }
        return maxP;
    }
}