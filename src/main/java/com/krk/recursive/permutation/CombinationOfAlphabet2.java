package com.krk.recursive.permutation;

public class CombinationOfAlphabet2 {
    public static void main(String[] args) {
        for (char d = 'A'; d <= 'Z'; d++) {
            for (char c = 'A'; c <= 'Z'; c++) {
                System.out.printf("%s%s\n", c,d);
            }
        }
    }
}
