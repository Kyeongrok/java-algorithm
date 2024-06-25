package com.krk.dp;

public class LeftAndRight {
    public static void main(String[] args) {

        int[] coins = {2, 7, 40, 19};
        Pair[][] dp = new Pair[coins.length][coins.length];

        int i = 1;
        for (int j = 0; j < coins.length - i; j++) {
            int coinLeft = coins[j];
            int coinRight = coins[j+i];
            System.out.printf("%d %d\n", coinLeft, coinRight);
        }

        i = 2;
        for (int j = 0; j < coins.length - i; j++) {
            int coinLeft = coins[j];
            int coinRight = coins[j+i];
            System.out.printf("%d %d\n", coinLeft, coinRight);
        }

        i = 3;
        for (int j = 0; j < coins.length - i; j++) {
            int coinLeft = coins[j];
            int coinRight = coins[j+i];
            System.out.printf("%d %d\n", coinLeft, coinRight);
        }
    }
}
