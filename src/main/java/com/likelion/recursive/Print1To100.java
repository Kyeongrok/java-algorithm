package com.likelion.recursive;

public class Print1To100 {
    public void print1To100(int num) {
        System.out.println(num);
        print1To100(num);
    }
    public static void main(String[] args) {
        new Print1To100().print1To100(100);
    }
}
