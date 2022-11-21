package com.likelion.remainder;

public class Caesar {
    public static char toCaesar(char c, int to) {

        // 0~25 사이 숫자로 표준화
        if ((int) c >= 97 && (int) c <= 122) {
            // 소문자
            int i = c - 97 + to;
            if (i > 25) i = i % 25;
            return (char)(i + 97);
        } else if ((int) c >= 65 && (int)c <= 90) {
            // 대문자
            int i = c - 65 + to;
            if (i > 25) i = i % 25;
            return (char)(i + 65);
        } else {
            return c; // 공백인 경우 그냥 return
        }

    }
    public static void main(String[] args) {
        // ab -1-> bc
        // AB -2-> CD
        // a b c  -1-> b c d
        // z a -1-> a b
        // 1개의 문자열을 시저 암호화 한다.
        // modulo를 이용해 처리 한다
        // 25는 26으로 나누면 나머지가 25 --> y
        // 26은 26으로 나누먼 나머지가 0 --> z
        // 27은 26으로 나누면 나머지가 1 --> a

        System.out.println(toCaesar('a', 1));
        System.out.println(toCaesar('z', 1));
//        toCaesar('A', 1);
//        toCaesar('Z', 1);

    }
}
