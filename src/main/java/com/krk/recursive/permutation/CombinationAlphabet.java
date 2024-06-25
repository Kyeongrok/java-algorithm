package com.krk.recursive.permutation;

public class CombinationAlphabet {
    public void printStrings(int n, String prefix) {
        if(n == 0){
            System.out.println(prefix);
        } else {
            for (int i = 0; i < 26; i++) {
                printStrings(n - 1, prefix + (char) (i + 65));
            }
        }
    }
    public static void main(String[] args) {
        CombinationAlphabet combinationAlphabet = new CombinationAlphabet();
        combinationAlphabet.printStrings(2, "");
    }
}
