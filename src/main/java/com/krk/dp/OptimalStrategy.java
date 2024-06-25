package com.krk.dp;

class Pair {
   int left;
   int right;

    public Pair(int left, int right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }
}

public class OptimalStrategy {
    public static void main(String[] args) {
        int[] coins = {2, 7, 40, 19};
        Pair[][] dp = new Pair[coins.length][coins.length];

        // 1개일 때
        for (int i = 0; i < dp.length; i++) {
            dp[i][i] = new Pair(coins[i], 0);
        }

        // 2개일 때
        for (int i = 0; i < coins.length - 1; i++) {
            int left = Math.max(coins[i], coins[i + 1]);
            int right = Math.min(coins[i], coins[i + 1]);
            dp[i][i+1] = new Pair(left, right);
        }
        System.out.println(dp[2][3].toString());

        // 3개이상일 때
        for (int i = 2; i < coins.length ; i++) {
            for (int j = 0; j < coins.length - i; j++) {
                System.out.printf("j:%d i:%d\n", j, i);
                int coinLeft = coins[j];
                int coinRight = coins[j+i];
                int x = coinLeft + dp[j+1][j+i].right;
                int y = coinRight + dp[j][j+i-1].right;
                int second = Math.min(dp[j + 1][j + i].left, dp[j][j + i - 1].left);
                dp[j][j + i] = new Pair(Math.max(x, y), second);
            }
        }

        System.out.println(dp[0][coins.length-1]);
    }
}
