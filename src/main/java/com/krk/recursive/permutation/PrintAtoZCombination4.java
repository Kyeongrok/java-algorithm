package com.krk.recursive.permutation;

import java.util.HashSet;
import java.util.Set;

public class PrintAtoZCombination4 {

    public static final String chars ="011";
    public static Set<Integer> printAlphabet(Set<Integer> set, String prefix, int depth) {
        if (prefix.length() > depth) return set;
        if (prefix != "") set.add(Integer.parseInt(prefix));

        for (int i = 0; i < chars.length(); i++) {
            printAlphabet(set, prefix + chars.charAt(i), depth);
        }
        return set;
    }

    public static void main(String[] args) {
        Set<Integer> set = printAlphabet(new HashSet<>(), "", 3);
        System.out.println(set);
    }
}
