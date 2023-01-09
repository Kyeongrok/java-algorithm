package com.likelion.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup1087 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        int n = Integer.parseInt(bf.readLine());
        int accu = 0;
        for (int i = 1; accu < n; i++) {
            accu += i;
        }
        System.out.println(accu);
    }
}
