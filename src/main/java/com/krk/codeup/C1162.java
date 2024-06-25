package com.krk.codeup;

import java.util.Scanner;

public class C1162 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();

        if((i - j + k) % 10 == 0 ) {
            System.out.println("대박");
        } else {
            System.out.println("그럭저럭");
        }

    }
}
