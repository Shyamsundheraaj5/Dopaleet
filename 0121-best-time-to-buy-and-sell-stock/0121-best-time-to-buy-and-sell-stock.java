class Solution {
    public int maxProfit(int[] prices) {
        int minValue = Integer.MAX_VALUE;
        int maxProfit=0;

        for(int price:prices){
            if(price<minValue){
                minValue = price;
            }
            if(price>minValue){
                int currProfit = price-minValue;
                maxProfit = Math.max(maxProfit,currProfit);
            }
        }
        return maxProfit;
    }
}