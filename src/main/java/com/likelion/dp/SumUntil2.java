package com.likelion.dp;

import java.util.Arrays;

public class SumUntil2 {
    public static void main(String[] args) {

        int[] coins = {2, 7, 40, 19};
        int[][] dp = new int[4][4];

        for (int i = 0; i < coins.length ; i++) {
            for (int j = i; j < coins.length; j++) {
                if (j == i) {
                    dp[i][j] = coins[j];
                } else {
                    dp[i][j] = dp[i][j-1] + coins[j];
                }
            }
            System.out.println(Arrays.toString(dp[i]));
        }
    }
}
