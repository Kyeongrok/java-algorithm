package com.krk.divisor;

public class Divide02 {
    public static int numSetBits(long a) {
        long sum = 0;
        while(a > 0) {
            sum += a % 2;
            a /= 2;
        }
        return (int) sum;
	}
    public static void main(String[] args) {
        System.out.println(numSetBits(11));
    }
}
