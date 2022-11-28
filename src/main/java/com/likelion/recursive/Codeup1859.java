package com.likelion.recursive;

public class Codeup1859 {
    public static String getStars(int n) {
        // 별을 만든다
        if(n == 0) return "";
        return "*" + getStars(n - 1);
    }
    public static void printStar(int n) { // 별을 출력한다
        if(n == 0) return;
        printStar(n - 1);
        System.out.println(getStars(n));
    }
    public static void main(String[] args) {
        System.out.println(getStars(4));
    }
}
