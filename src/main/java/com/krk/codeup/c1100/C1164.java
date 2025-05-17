package com.krk.codeup.c1100;

import java.util.Scanner;

public class C1164 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        for (int i = 0; i < 3; i++) {
            if(sc.nextInt() <= 170){
                System.out.println("CRASH");
                break;
            }
            cnt++;
        }
        if(cnt == 3) System.out.println("PASS");

    }
}
