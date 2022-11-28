package com.likelion.recursive.test;

public class Print1To100V2 {
    public static void print1To100(int n) {
        if(n > 100) return; // 여기에 도달 할 수 있게
        System.out.println(n);
        print1To100(n + 1);
    }
    public static void main(String[] args) {
        print1To100(1); // 출발을 1에서 한것 기억
    }
}
