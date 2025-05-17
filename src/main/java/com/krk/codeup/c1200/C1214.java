package com.krk.codeup.c1200;

import java.util.Scanner;

public class C1214 {
    public static boolean leap(int year){
        if(year % 400 == 0) return true;
        if(year % 4 == 0 && year % 100 != 0) return true;
        return false;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();

        int[] arr = new int[13];
        arr[1] = 31;
        arr[2] = 28;
        arr[3] = 31;
        arr[4] = 30;
        arr[5] = 31;
        arr[6] = 30;
        arr[7] = 31;
        arr[8] = 31;
        arr[9] = 30;
        arr[10] = 31;
        arr[11] = 30;
        arr[12] = 31;

        if(leap(i) && j == 2){
            System.out.println(29);
        } else {
            System.out.println(arr[j]);
        }
    }
}
