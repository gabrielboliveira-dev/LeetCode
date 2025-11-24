package Java;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int currentPrice : prices) {
            if (currentPrice < minPrice) {
                minPrice = currentPrice;
            }
            else {
                int profitToday = currentPrice - minPrice;
                if (profitToday > maxProfit) {
                    maxProfit = profitToday;
                }
            }
        }
        return maxProfit;
    }
}
