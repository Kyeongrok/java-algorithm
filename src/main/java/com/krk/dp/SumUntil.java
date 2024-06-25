package com.krk.dp;

import java.util.Arrays;

public class SumUntil {
    public static void main(String[] args) {

        int[] coins = {2, 7, 40, 19};
        int[][] dp = new int[4][4];

        int i = 0;
        for (int j = i; j < coins.length; j++) {
            if (j == 0) {
                dp[i][j] = coins[j];
            } else {
                dp[i][j] = dp[i][j-1] + coins[j];
            }
        }
        System.out.println(Arrays.toString(dp[0]));

        i = 1;
        for (int j = i; j < coins.length; j++) {
            if (j == i) {
                dp[i][j] = coins[j];
            } else {
                dp[i][j] = dp[i][j-1] + coins[j];
            }
        }
        System.out.println(Arrays.toString(dp[1]));

    }
}
