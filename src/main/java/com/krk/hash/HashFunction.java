package com.krk.hash;

public class HashFunction {
    int[] table = new int[1000];
    public int hash(String str) {
        int ascii = 0;
        for (int i = 0; i < str.length(); i++) {
            ascii += str.charAt(i);
        }
        return ascii % 1000;
    }

    public void insert(String key, int value) {
        this.table[hash(key)] = value;
    }

    public int get(String key) {
        return this.table[hash(key)];
    }

    public static void main(String[] args) {
        HashFunction hf = new HashFunction();
        hf.insert("kyeongrok", 10);
        if (10 == hf.get("kyeongrok")) {
            System.out.println("테스트 통과");
        }

    }
}
