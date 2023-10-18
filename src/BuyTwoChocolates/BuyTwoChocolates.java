package BuyTwoChocolates;

import java.util.*;

public class BuyTwoChocolates {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int ans = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[0] + prices[1] <= money) {
                 ans = prices[0] + prices[1];
            } else {
                ans = money;
            }
        }
        return ans;
    }

    }
