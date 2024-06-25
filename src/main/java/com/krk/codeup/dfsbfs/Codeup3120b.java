package com.krk.codeup.dfsbfs;

import java.util.*;

public class Codeup3120b {
    public static void dfs(int targetValue, int n, int count, int[] counts) {
        int[] buttons = new int[]{10, 5};
        if (-2 <= n && n <= 2 ){
//            System.out.printf("n:%d count:%d\n", n, count);
            counts[count + Math.abs(n)]++;
        } else if (count < targetValue && n >= -10) {
//            System.out.printf("n:%d count:%d\n", n, count);
            for (int i = 0; i < buttons.length; i++) {
                dfs(targetValue, n - buttons[i], count + 1, counts);
            }
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        int t = Math.abs(sc.nextInt() - sc.nextInt());
//        int t = Math.abs(22 - 3);
        int t = Math.abs(7 - 34);
        int[] counts = new int[t + 1];
        dfs(t, t, 0, counts);

//        System.out.println(Arrays.toString(counts));
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0){
                System.out.println(i);
                break;
            }
        }

    }
}
