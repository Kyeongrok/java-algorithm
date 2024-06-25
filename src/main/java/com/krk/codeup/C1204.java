package com.krk.codeup;

import java.util.Scanner;

public class C1204 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int oneThDec = i % 10;

        String postFix = "th";
        switch (oneThDec){
            case 1: postFix = "st"; break;
            case 2: postFix = "nd"; break;
            case 3: postFix = "rd"; break;
        }
        if(i / 10 == 1) postFix = "th";

        System.out.printf("%d%s\n", i, postFix);
    }
}
