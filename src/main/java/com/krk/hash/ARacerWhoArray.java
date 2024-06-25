package com.krk.hash;

public class ARacerWhoArray {
    public String solution(String[] participant, String[] completion) {

        int[] memo = new int[completion.length];
        for (int i = 0; i < participant.length; i++) {
//            memo[i] = 1;
        }
        for (int i = 0; i < completion.length; i++) {
//            memo[i] --;
        }
        // array를 써서는 동명이인을 찾을 수 없다.
        return "";
    }

    public static void main(String[] args) {
        ARacerWhoArray arw = new ARacerWhoArray();
        var r1 = arw.solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"});
    }
}
