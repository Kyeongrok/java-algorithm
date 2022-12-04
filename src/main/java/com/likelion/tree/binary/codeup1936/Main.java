package com.likelion.tree.binary.codeup1936;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int goUp(int a, int b) {
        if(a > b) {
            return goUp(a / 2, b) + 1; // a를 부모 쪽으로
        } else if (a < b) {
            return goUp(a, b / 2) + 1; // b를 부모 쪽으로
        } else { // a == b
            return 0;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        String[] n = bf.readLine().split(" ");
        System.out.println(goUp(Integer.parseInt(n[0]), Integer.parseInt(n[1])));
    }
}
