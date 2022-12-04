package com.likelion;

public class CntOfpy {
    public boolean solution(String s) {
        // 대문자 또는 소문자 개수를 세는 방법
        int cntP = 0;
        for (int i = 0; i < s.length(); i++) {
            if('p' == s.charAt(i) || 'P' == s.charAt(i)) cntP ++;
        }
        return false;
    }
    public static void main(String[] args) {

    }
}
