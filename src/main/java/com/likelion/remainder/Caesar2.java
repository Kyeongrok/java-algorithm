package com.likelion.remainder;

public class Caesar2 {

    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')){
                int theta = 65;
                if ((int) s.charAt(i) >= 97) theta = 97;
                int r = ((int) s.charAt(i) - theta + n) % 26;
                sb.append((char)(theta + r));
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Caesar2 caesar2 = new Caesar2();
        System.out.println(caesar2.solution("AB", 1));
        System.out.println(caesar2.solution("A B", 1));
        System.out.println(caesar2.solution("A Z", 1));
        System.out.println(caesar2.solution("a z", 25));
        System.out.println(caesar2.solution("a B z", 4));
        System.out.println(caesar2.solution("AaZz", 25));
        System.out.println(caesar2.solution("    ", 25));
        System.out.println(caesar2.solution("    ", 25));


    }
}
