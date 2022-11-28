package com.likelion.recursive;

import com.likelion.recursive.codeup1853.Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Recursive1851 {
    private static void printNum(int num) {
        if(num == 0) return;
        System.out.printf("%s", "*");
        printNum(num - 1);
    }
    private static String printNum2(int num) {
        if(num == 0) return "";
        return "*" + printNum2(num - 1);
    }
    public static void main(String[] args) throws IOException {
        // 한 정수 n을 입력받아 n개의 별(*)을 출력하시오.
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        int n = Integer.parseInt(bf.readLine());
        printNum(n);
        String r = printNum2(n);
        System.out.println("----------");
        System.out.println(r);
    }
}
