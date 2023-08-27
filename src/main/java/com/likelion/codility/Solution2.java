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
        for (int i = 0; i < S.length(); i++) {
            for (int j = i + 1; j <= S.length(); j++) {
                String substr = S.substring(i, j);
//                System.out.println(substr);
                boolean is = isBalanced(substr);
//                System.out.println(is);
                if(is){
                    return substr.length();
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(solution("azABaabza"));
        System.out.println(solution("CATattac"));
//        System.out.println(isBalanced("CATattac"));
        System.out.println(solution("azABaabza"));
    }
}
