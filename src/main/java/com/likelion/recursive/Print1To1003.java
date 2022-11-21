package com.likelion.recursive;

public class Print1To1003 {
    public void print1To100(int num) {
        if (num > 100) return;
        System.out.println(num);
        print1To100(num + 1);
    }
    public static void main(String[] args) {
        new Print1To1003().print1To100(1);
    }
}
