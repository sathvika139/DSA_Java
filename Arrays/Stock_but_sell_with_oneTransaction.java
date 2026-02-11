 class Stock_but_sell_with_oneTransaction {
    public int maximumProfit(int prices[]) {
    if (prices == null || prices.length == 0) {
            return 0;
        }

        int minprice = prices[0];
        int maxprofit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minprice) {
                minprice = prices[i];
            } else {
                int profit = prices[i] - minprice;
                maxprofit = Math.max(maxprofit, profit);
            }
        }

        return maxprofit;
      }
    }

