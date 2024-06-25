package com.krk.codeup;

import java.util.Scanner;

public class C1205 {
    public static int plus(int i, int j){
        return i + j;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();

        float max = plus(i, j);
        if(max < j + i) max = j + i;
        if(max < i - j) max = i - j;
        if(max < j - i) max = j - i;
        if(max < i * j) max = i * j;
        if(max < j * i) max = j * i;
        if(max < i / j) max = i / j;
        if(max < j / i) max = j / i;
        if(max < Math.pow(i, j)) max = (float) Math.pow(i, j);
        if(max < Math.pow(j, i)) max = (float) Math.pow(j, i);
        System.out.printf("%f", max);

    }
}
