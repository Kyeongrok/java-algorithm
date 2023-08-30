package com.likelion.programmers;

public class Solution42dot1 {
    public int[] solution(int[][] v) {

        for (int i = 0; i < v.length; i++) {
            System.out.printf("%d %d\n", v[i][0], v[i][1]);
        }

        return new int[]{0, 1};
    }
    public static void main(String[] args) {
        Solution42dot1 solution42dot1 = new Solution42dot1();

        solution42dot1.solution(new int[][]{{1, 4}, {3, 4}, {3, 10}});
    }
}
