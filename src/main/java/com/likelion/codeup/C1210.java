package com.likelion.codeup;

import java.util.Scanner;

public class C1210 {
    public static int plus(int i, int j){
        return i + j;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();

        int[] arr = new int[6];
        arr[1] = 400;
        arr[2] = 340;
        arr[3] = 170;
        arr[4] = 100;
        arr[5] = 70;

        if (arr[i] + arr[j] > 500) {
            System.out.println("angry");
        } else {
            System.out.println("no angry");
        }
    }
}
