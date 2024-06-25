package com.krk.recursive.permutation;

public class CA3 {
    public static void print(String prefix, int depth) {
        if (depth == 0){
            System.out.println(prefix);
        } else{
            for (char i = 'A'; i <= 'Z'; i++) {
                print(prefix + i, depth - 1);
            }
        }
    }
    public static void main(String[] args) {
        print("", 2);
    }
}
