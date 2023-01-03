package com.likelion.dp;

import java.util.Arrays;

public class LCS2 {
    public static void main(String[] args) {
        String str1 = "ABCDCBA"; // 열
        String str2 = "DCABDC"; // 행

        // str2인 DCABDC를 i로 놓고 바깥쪽에서 반복할 예정 //행
        // str1인 ABCDCBA를 j로 놓고 안쪽에서 반복할 예정 //열

//        str2.length() * str1.length()
        int[][] dp = new int[str2.length()+1][str1.length()+1];

        for (int i = 0; i <= str2.length(); i++) {
            for (int j = 0; j <= str1.length(); j++) {
//                System.out.printf("i:%s j:%s\n", str2.charAt(i), str1.charAt(j));
                // 두개가 같으면 대각선에서 가지고 옵니다.
                // 대각선 dp[i-1][j-1]
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                } else if(str1.charAt(j-1) == str2.charAt(i-1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    // 두개가 다르면 max(위, 왼쪽)을 기록 합니다.
                    int up = dp[i - 1][j];
                    int left = dp[i][j - 1];
                    dp[i][j] = Math.max(up, left);
                }

            }
            System.out.println(Arrays.toString(dp[i]));
        }
        int answer = dp[str2.length()][str1.length()];
        System.out.println(answer);
    }
}
