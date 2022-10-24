package com.likelion.hash;

public class HashFunction {
    public int hash(String str) {
        int ascii = 0;
        for (int i = 0; i < str.length(); i++) {
            ascii += str.charAt(i);
        }
        return ascii / 1000;
    }

    public static void main(String[] args) {
        HashFunction hf = new HashFunction();
        int i = hf.hash("kyeonrok");
        System.out.println(i);
    }
}
