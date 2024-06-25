package com.krk.codeup.dfsbfs;

import java.util.Scanner;

/*
    입력1:
    5 10
    -1 1 1 1 1 1 -1 2 9 3
    -1 1 -1 -1 -1 -1 2 2 9 3
    -1 -1 -1 -1 -1 -1 -1 -1 -1 -1
    4 4 4 4 4 5 5 6 6 -1
    -1 -1 -1 4 4 -1 5 5 6 -1

    입력2:
    4 19
    1 1 1 2 2 2 4 4 4 3 3 7 7 7 8 8 8  9 9
    1 3 3 3 3 3 3 3 3 3 2 7 7 7 7 7 9 9 0
    4 2 4 5 2 3 3 3 2 7 4 2 3 4 1 9 1 0 0
    -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 0
 */
public class Codeup2062 {
    public static int[][] initMap() {
        String[] input = {
        "-1 1 1 1 1 1 -1 2 9 3",
        "-1 1 -1 -1 -1 -1 2 2 9 3",
        "-1 -1 -1 -1 -1 -1 -1 -1 -1 -1",
        "4 4 4 4 4 5 5 6 6 -1",
        "-1 -1 -1 4 4 -1 5 5 6 -1"};

        int[][] map = new int[5][10];
        for (int i = 0; i < input.length; i++) {
            String[] arr = input[i].split(" ");
            for (int j = 0; j < arr.length; j++) {
                map[i][j] = Integer.parseInt(arr[j]);
            }
        }
        return map;
    }

    public static int[][] initMapFromQuestion() {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int[][] map = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        return map;
    }

    public static int dfs(int r, int c, int[][] map, int[][] visited) {
        if(map[r][c] == -1) return 0;

        int count = 1;
        visited[r][c] = 1;

        int[][] locations = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        for (int i = 0; i < locations.length; i++) {
            int newRow = r + locations[i][0];
            int newColumn = c + locations[i][1];
            if(newRow >= 0 && newRow < visited.length &&
                newColumn >= 0 && newColumn < visited[0].length &&
                map[r][c] == map[newRow][newColumn] &&
                visited[newRow][newColumn] == 0
            ){
                visited[newRow][newColumn] = 1;
                count += dfs(newRow, newColumn, map, visited);
            }
        }

        return count;
    }
    public static void main(String[] args) {
//        int[][] map = initMap();
        int[][] map = initMapFromQuestion();
        int[][] visited = new int[map.length][map[0].length];
        int[] memo = new int[10];

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if(map[i][j] >= 0){
                    int cnt = dfs(i, j, map, visited);
                    if(memo[map[i][j]] < cnt){
                        memo[map[i][j]] = cnt;
                    }
                }
            }
        }
//        System.out.println(Arrays.toString(memo));
        for (int i = 0; i < memo.length; i++) {
            if(memo[i] > 0) System.out.printf("%d %d\n", i, memo[i]);
        }
    }
}
