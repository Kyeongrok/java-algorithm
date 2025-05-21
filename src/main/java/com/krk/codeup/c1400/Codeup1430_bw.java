package com.krk.codeup.c1400;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Codeup1430_bw {
    /*
5
2 52 23 55 100
4
5 2 55 99

0 1 1 0
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean[] arr = new boolean[10_000_000];
        for (int i = 0; i < n; i++) {
            arr[sc.nextInt()] = true;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            int v = sc.nextInt();
            try {
                bw.write(arr[v] ? "1" : "0");
                bw.write(" ");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            bw.flush();
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
