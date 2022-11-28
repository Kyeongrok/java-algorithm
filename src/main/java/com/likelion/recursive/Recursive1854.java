package com.likelion.recursive;

public class Recursive1854 {
    public static int sumOfDigit(int q){
        if(q == 0) return 0;
        return q % 10 + sumOfDigit(q / 10);
    }
    public static void main(String[] args) {
        System.out.println(sumOfDigit(687));
    }
}
