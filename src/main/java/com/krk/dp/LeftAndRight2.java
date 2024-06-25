package com.krk.dp;

public class LeftAndRight2 {
    public static void main(String[] args) {

        int[] coins = {2, 7, 40, 19};
        Pair[][] dp = new Pair[coins.length][coins.length];

        for (int i = 1; i < coins.length ; i++) {
            for (int j = 0; j < coins.length - i; j++) {
                int coinLeft = coins[j];
                int coinRight = coins[j+i];
                dp[i][j] = new Pair(coinLeft, coinRight);
                System.out.printf("%d %d\n", coinLeft, coinRight);
            }
        }
    }
}
