class Solution {
    public int maxProfit(int[] prices) {
        int minP = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price:prices){
            if(price < minP){
                minP = price;
            }
            else{
                int profit = price - minP;
                maxProfit = Math.max(profit,maxProfit);

            }

           
        }
         return maxProfit;
    }
}
