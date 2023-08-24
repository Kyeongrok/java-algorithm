package com.likelion.codility;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Stack;
public class Solution2 {
    public static boolean isBalanced(String substring) {

        Set<Character> upperSet = new HashSet<>();
        Set<Character> lowerSet = new HashSet<>();

        for (int i = 0; i < substring.length(); i++) {
            Character c = substring.charAt(i);
            if(Character.isUpperCase(c)){
                upperSet.add(c);
            }else {
                lowerSet.add(c);
            }
        }

        if (upperSet.size() != lowerSet.size()) return false;

        int cnt = 0;
        Iterator<Character> it = upperSet.iterator();
        while (it.hasNext()) {
            Character c = it.next();
            if(lowerSet.contains(Character.toLowerCase(c))) cnt++;
        }

        return upperSet.size() == cnt;
    }

    public static int solution(String S) {
        int result = -1;
        for (int i = 0; i < S.length(); i++) {
            for (int j = i + 1; j <= S.length(); j++) {
                String substr = S.substring(i, j);
                if(isBalanced(substr)){
//                    System.out.println(substr);
                    result = substr.length();
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
//        System.out.println(isBalanced("azABaabza"));
//        System.out.println(solution("CATattac"));
        System.out.println(solution("azABaabza"));
    }
}
