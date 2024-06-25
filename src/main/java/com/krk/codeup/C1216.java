package com.krk.codeup;

import java.util.Scanner;

public class C1216 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();

        if (i < (j - k)) {
            System.out.println("advertise");
        } else if (i > (j - k)) {
            System.out.println("do not advertise");
        } else {
            System.out.println("does not matter");
        }
    }
}
