package com.likelion.permutation;

public class CA1 {
    public static String print(Character prefix) {
        // char는 1글자 밖에 안되므로 리턴은 String으로 합니다.
        String s = String.valueOf('A'); // char형의 'A'를 Stirng으로
        return prefix + s; // prefix와 char형의 s를 더해서 리턴
    }
    public static void main(String[] args) {
        System.out.println(print('A'));
    }
}
