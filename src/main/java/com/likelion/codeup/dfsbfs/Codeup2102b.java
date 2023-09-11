package com.likelion.codeup.dfsbfs;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Codeup2102b {

    /*
    bin     dec
    1 -->   1
    10 -->  2
    11 -->  3

    이진수 11111111111111111100 를 10진수로 바꿔서 %연산 하고
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        BigInteger targetNum = new BigInteger("396");
        BigInteger targetNum = new BigInteger(sc.nextLine());

        for (int i = 1; i <= 1048572; i++) {
            String str2 = Integer.toBinaryString(i);
            BigInteger bi2 = new BigInteger(str2).mod(targetNum);
            if (bi2.intValue() == 0){
                System.out.printf("%d\n", bi2);
            }
        }


    }
}
