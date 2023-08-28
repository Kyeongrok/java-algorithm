package com.likelion.codeup;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Codeup1283 {
    /*
    input:
    10000
    4
    10 -10 5 -5
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int investedAmount = sc.nextInt();
        int dailyVolatility = sc.nextInt();

        float result = investedAmount;
        for (int i = 0; i < dailyVolatility; i++) {
            result = result + (result * sc.nextInt() / 100);
        }

        // 0.5>순수익>-0.5이면 순수익은 0
        float netIncome = result - investedAmount;
        if (netIncome < 0.5 && netIncome > -0.5) {
            netIncome = 0.0f;
        }

        DecimalFormat format = new DecimalFormat("#");
        System.out.printf("%s\n", format.format(netIncome));

        if (netIncome == 0.0f){
            System.out.println("same");
        } else if (netIncome < 0) {
            System.out.println("bad");
        } else {
            System.out.println("good");
        }
    }
}
