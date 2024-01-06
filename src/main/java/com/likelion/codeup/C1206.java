package com.likelion.codeup;

import java.util.Scanner;

public class C1206 {
    public static int plus(int i, int j){
        return i + j;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();

        if(i < j){
            int temp = i;
            i = j;
            j = temp;
        }

        if(i % j == 0){
            System.out.printf("%d*%d=%d\n", j, i / j, i);
        } else {
            System.out.println("non");
        }
    }
}
