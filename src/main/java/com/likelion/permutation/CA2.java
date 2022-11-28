package com.likelion.permutation;

public class CA2 {
    public static void print(String prefix, int depth) {
        if (depth == 0){
            System.out.println(prefix);
        } else{
            for (char i = 'A'; i <= 'Z'; i++) {
                String s = String.valueOf(i); // char형의 'A'를 Stirng으로
                print(prefix + s, depth - 1); // prefix와 char형의 s를 더해서 리턴
            }
        }

        // 더하는 것이 깊어지고
        // depth가 0이 될때 리턴
    }
    public static void main(String[] args) {
        print("", 1);
    }
}
