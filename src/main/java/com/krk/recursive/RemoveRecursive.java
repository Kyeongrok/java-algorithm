package com.krk.recursive;

public class RemoveRecursive {
    public static void recur(int n) {
        if (n <= 0) return;
        recur(n - 1);
        System.out.println(n);
        recur(n - 2);
    }
    public static void recur2(int n) {
//        if (n <= 0) return;
        while(n > 0){
            recur(n - 1);
            System.out.println(n);
//        recur(n - 2); 꼬리 재귀
            n = n - 2;
        }
    }
    public static void main(String[] args) {
        recur2(3);
    }
}
