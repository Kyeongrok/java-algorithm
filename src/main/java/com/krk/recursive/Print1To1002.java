package com.krk.recursive;

public class Print1To1002 {
    public void print1To100(int num) {
        if (num == 100) {
            return;
        }
        System.out.println(num);
        print1To100(num);
    }
    public static void main(String[] args) {
        new Print1To1002().print1To100(1);
    }
}
