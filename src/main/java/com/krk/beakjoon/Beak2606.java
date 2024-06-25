package com.krk.beakjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Beak2606 {

    /*
    https://www.acmicpc.net/problem/2606
    입력값
    7
    6
    1 2
    2 3
    1 5
    5 2
    5 6
    4 7

    답:4
     */

    public static void dfs(int idx, int[] visited, int[][] graph) {
        visited[idx] = 1;
        for (int i = 1; i < visited.length; i++) {
            if(visited[i] == 0 && graph[idx][i] == 1) dfs(i, visited, graph);
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        // graph만들기
        int[][] graph = new int[N + 1][N + 1];
        int[] visited = new int[N + 1];

        for (int i = 0; i < M; i++) {
            graph[sc.nextInt()][sc.nextInt()] = 1;
        }

        dfs(1, visited, graph);
        System.out.println(Arrays.toString(visited));
    }
}
