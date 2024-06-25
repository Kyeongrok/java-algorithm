package com.krk.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup1086 {
    private static int getByte(int width, int height, int nBits) {
        return width * height * nBits / 8;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        String str = bf.readLine();
        String[] strArr = str.split(" ");
        int nByte = Codeup1086.getByte(Integer.parseInt(strArr[0]), Integer.parseInt(strArr[1]), Integer.parseInt(strArr[2]));
        float r = nByte / 1024 ;
        System.out.printf("%.2f MB", r / 1024);
    }
}
