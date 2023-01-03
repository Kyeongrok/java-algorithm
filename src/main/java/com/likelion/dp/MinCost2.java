package com.likelion.dp;

import java.util.Arrays;

public class MinCost2 {
    public int getMinCost(int[][] matrix) {
        int[][] dp = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == 0 && j == 0) {
                    dp[0][0] = matrix[0][0];
                } else if (i == 0 && j > 0) { // i는 0 고정
                    dp[i][j] = dp[i][j-1] + matrix[i][j];
                } else if (i > 0 && j == 0) { // i는 0 고정
                    dp[i][j] = dp[i-1][j] + matrix[i][j];
                } else if (i > 0 && j > 0) {
                    // 총 3군데 --> 위 i-1, 왼쪽 j-1, 대각선위 [i-1][j-1]
                    dp[i][j] = Math.min(Math.min(dp[i-1][j], dp[i][j-1]), dp[i-1][j-1]) + matrix[i][j];
                }
            }
        }

        for (int i = 0; i < dp.length; i++) {
            System.out.println(Arrays.toString(dp[i]));
        }
        return dp[matrix.length-1][matrix[0].length-1];
    }
    public static void main(String[] args) {
        int[][] matrix = {
           { 1,3,2 },
           { 4,6,2 },
           { 1,2,4 }
         };
        MinCost2 minCost = new MinCost2();
        var r = minCost.getMinCost(matrix);
        System.out.println(r);
    }
}
