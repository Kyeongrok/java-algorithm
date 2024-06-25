package com.krk.dp.codeup2699;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static int isSame(char i, char j) {
        return i == j ? 1 : 0;
    }
    public static int lcs(String str1, String str2) {
        int[][] memo = new int[str2.length()][str1.length()];

        for (int i = 0; i < str2.length(); i++) {
            for (int j = 0; j < str1.length(); j++) {
//                System.out.printf("%s %s\n", str2.charAt(i), str1.charAt(j));
                if (i == 0 && j == 0) {
                    memo[i][j] = isSame(str2.charAt(i), str1.charAt(j));
                } else if (i == 0 && j > 0) { // i가 0이므로 왼쪽만 참조 가능
                    memo[i][j] = memo[i][j - 1] + isSame(str2.charAt(i), str1.charAt(j));
                } else if (i > 0 && j == 0) { // j가 0이므로 위쪽만 참조 가능
                    memo[i][j] = memo[i-1][j] + isSame(str2.charAt(i), str1.charAt(j));
                } else if (i > 0 && j > 0) {
                    memo[i][j] = Math.max(memo[i][j - 1], memo[i - 1][j]) + isSame(str2.charAt(i), str1.charAt(j));
                }
            }
        }
        return memo[str2.length()-1][str1.length()-1];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        String str1 = bf.readLine();
        String str2 = bf.readLine();
        System.out.println(lcs(str1, str2));
    }
}
