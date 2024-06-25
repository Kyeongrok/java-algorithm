package com.krk.dp;

import java.util.Arrays;

public class LCS {

    private int isSame(char i, char j) {
        if (i == j) {
            return 1;
        } else {
            return 0;
        }
    }
    public int lcs(String str1, String str2) {
        int[][] memo = new int[str2.length()][str1.length()];

        for (int i = 0; i < str2.length(); i++) {
            for (int j = 0; j < str1.length(); j++) {
//                System.out.printf("%s %s\n", str2.charAt(i), str1.charAt(j));
                int r = 0;
                if (i == 0 && j == 0) {
                    r = isSame(str2.charAt(i), str1.charAt(j));
                } else if (i == 0 && j > 0) { // i가 0이므로 왼쪽만 참조 가능
                    r = memo[i][j - 1] + isSame(str2.charAt(i), str1.charAt(j));
                } else if (i > 0 && j == 0) { // j가 0이므로 위쪽만 참조 가능
                    r = memo[i-1][j] + isSame(str2.charAt(i), str1.charAt(j));
                } else if (i > 0 && j > 0) {
                    r = Math.max(memo[i][j - 1], memo[i - 1][j]) + isSame(str2.charAt(i), str1.charAt(j));
                }
                memo[i][j] = r;
            }
            System.out.println(i + Arrays.toString(memo[i]));
        }

        return memo[str2.length()-1][str1.length()-1];
    }
    public static void main(String[] args) {
        LCS lcs = new LCS();
//        var r = lcs.lcs("sicohwkdfjxo", "wocibhxs");
        var r = lcs.lcs("aggtab", "gxtxayb");
        System.out.println(r);

    }
}
