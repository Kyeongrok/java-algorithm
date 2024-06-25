package com.krk.codeup;

import java.util.Scanner;

public class C1212 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();

        for (int l = 0; l < 2; l++) {
            for (int m = l + 1; m < 3; m++) {
                if(arr[l] > arr[m]){
                    int temp = arr[l];
                    arr[l] = arr[m];
                    arr[m] = temp;
                }
            }
        }

        if (arr[0] + arr[1] > arr[2]) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
