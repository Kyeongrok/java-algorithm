package com.krk.codeup.c1400;

import java.util.Scanner;

public class Codeup1415 {
    // 10개의 자연수가 주어질 때, 홀수들 중 가장 큰 수와 짝수들 중 가장 큰 수를
    // 구하여 출력하는 프로그램을 작성하시오. (단 모든 수가 홀수 혹은 짝수라면 가장 큰 수만 출력한다.)

    public static void main(String[] args) {

        int maxEvenNumber = -1;
        int maxOddNumber = -1;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            if(n % 2 == 0 && maxEvenNumber < n) {
                maxEvenNumber = n;
            } else if (n % 2 != 0 && maxOddNumber < n) {
                maxOddNumber = n;
            }
        }

        if(maxOddNumber != -1) System.out.println(maxOddNumber);
        if(maxEvenNumber != -1) System.out.println(maxEvenNumber);
    }
}
