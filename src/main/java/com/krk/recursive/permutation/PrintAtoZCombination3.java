package com.krk.recursive.permutation;

public class PrintAtoZCombination3 {

    public static void printAlphabet(String prefix, int depth) {
        if (prefix.length() >= depth) {
            System.out.println(prefix);
            return;
        }
        for (char c = 'A'; c <= 'Z'; c++) {
            printAlphabet(prefix + c, depth);
        }
    }

    public static void main(String[] args) {
        printAlphabet("", 2);
    }
}
