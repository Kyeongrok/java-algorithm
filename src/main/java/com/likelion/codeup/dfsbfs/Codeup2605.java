package com.likelion.codeup.dfsbfs;

import java.util.Scanner;
import java.util.Stack;

/*
Codeup 2605 캔디팡
DFS
 */
public class Codeup2605 {
    public static int[][] initMap(int rowCnt, int columnCnt) {
        int[][] map = new int[rowCnt + 1][columnCnt + 1];
        String[] str = {
                "2 1 5 1 1 3 4",
                "2 1 5 1 3 5 3",
                "2 3 4 5 2 2 4",
                "4 4 3 2 3 1 3",
                "4 3 5 3 1 4 3",
                "5 4 4 3 3 5 5",
                "2 1 3 5 1 1 2"
        };
        // 문자열 배열을 2차원 배열 map으로 파싱하여 저장
        for (int i = 0; i < str.length; i++) {
            String[] tokens = str[i].split(" ");
            for (int j = 0; j < tokens.length; j++) {
                map[i + 1][j + 1] = Integer.parseInt(tokens[j]);
            }
        }
        return map;
    }
    public static int dfs(int r, int c, int[][] visited, int[][] map) {

        int count = 1;
        visited[r][c] = 1;

        // map의 범위 안에서 상하좌우로 이동한다.
        int[][] directions = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
        for (int i = 0; i < directions.length; i++) {
            // 같은 숫자일때만 dfs를 재귀 호출 하면서 이동한다.
            int nextRow = r + directions[i][0];
            int nextColumn = c + directions[i][1];
            if (nextRow > 0 && nextRow < visited.length && nextColumn > 0 && nextColumn < visited.length){
                if(map[r][c] == map[nextRow][nextColumn] && visited[nextRow][nextColumn] == 0){
                    count += dfs(nextRow, nextColumn, visited, map);
                }
            }
        }

        return count;
    }
    public static void print2xArr(int[][] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-------------");
    }
    public static void main(String[] args) {
        int n = 7;
        int[][] map = new int[n + 1][n + 1];
        int[][] visited = new int[n + 1][n + 1];
//        map = initMap(n, n);

        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                map[i][j] = sc.nextInt();
            }
        }

//        print2xArr(map);

        int answer = 0;
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= n; c++) {
                if(visited[r][c] == 0){
                    int cnt = dfs(r, c, visited, map);
//                    if(cnt >= 3) System.out.printf("cnt:%d answer:%d\n", cnt, ++answer);
                    if(cnt >= 3) answer++;
                }
            }
        }
        System.out.println(answer);
    }
}
