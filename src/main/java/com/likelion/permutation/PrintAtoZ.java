package com.likelion.permutation;

public class PrintAtoZ {
    public static void printAlphabet(char c) {
        if (c > 'Z') return;
        System.out.println(c);
        printAlphabet((char)(c + 1));
    }
    public static void main(String[] args) {
        printAlphabet('A');
    }
}
