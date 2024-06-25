package com.krk.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Recursive1853 {
    public static int sum(int num) {
        if(num == 0) return num;
        return num + sum(num -1);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        int n = Integer.parseInt(bf.readLine());
        System.out.println(sum(n));
    }
}
