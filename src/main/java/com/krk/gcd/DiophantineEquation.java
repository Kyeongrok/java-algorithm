package com.krk.gcd;

import java.util.Scanner;

public class DiophantineEquation {
    public static int gcd(int a, int b) {
        while(a > 1){
            if(a < b) {
                int temp = a;
                a = b;
                b = temp;
            }
            a = a % b;
        }
        if(a == 0) {
            return b;
        } else {
            return a;
        }
    }
    public static void main(String[] args) {

        int a, b, c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int gcd = gcd(a,b);
        if (gcd == 1 || gcd % c == 0) {
            for (int i = c; i >= 1; i--) {
                for (int j = c; j >= 1; j--) {
                    if(a * i + b * j == c){
                        System.out.printf("%d %d", i, j);
                    }
                }
            }
        } else {
            System.out.println("Not Exist");
        }
    }
}
