package arrays;

import java.util.Arrays;

public class Coins {

	 public static int coinChange(int[] coins, int amount) {
	        int[] dp = new int[amount + 1];
	        Arrays.fill(dp, amount + 1);
	        dp[0] = 0;

	        for (int i = 1; i <= amount; i++) {
	            for (int j = 0; j < coins.length; j++) {
	                if (coins[j] <= i) {
	                    dp[i] = Math.min(dp[i], 1 + dp[i - coins[j]]);
	                }
	            }
	        }

	        return dp[amount] > amount ? -1 : dp[amount];
	    }

	    public static void main(String[] args) {
	        int[] coins = {1, 2, 5};
	        int amount = 8;
	        int minCoins = coinChange(coins, amount);
	        System.out.println("Fewest number of coins: " + minCoins);
	    }
}
