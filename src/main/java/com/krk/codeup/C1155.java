package com.krk.codeup;

import java.util.Scanner;

public class C1155 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        System.out.println(i % 7 == 0 ? "multiple" : "not multiple");
    }
}
