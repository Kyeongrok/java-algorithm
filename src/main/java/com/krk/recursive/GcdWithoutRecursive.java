package com.krk.recursive;

public class GcdWithoutRecursive {
    public static void main(String[] args) {
        int a = 196;
        int b = 42;

        while(a != b){
            if(a > b){
                a = a -b;
            }else if (a < b) { // 28, 42
                b = b - a;
            }
            System.out.printf("%d, %d\n", a, b);
        }
    }
}
