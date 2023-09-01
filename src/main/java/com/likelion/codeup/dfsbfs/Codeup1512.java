package com.likelion.codeup.dfsbfs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Codeup1512 {

    /*
    입력값:
    5           10
    3 4         5 5
     */
    public static void print2xArr(int[][] arr) {
        for (int j = 1; j < arr.length; j++) {
            for (int k = 1; k < arr.length; k++) {
                System.out.printf("%d ", arr[j][k]);
            }
            System.out.println();
        }
    }
    public static Queue<int[]> dfs(int[][] visited, int[][] map,
                           Queue<int[]> queue){

        int[] location = queue.poll();
        int r = location[0];
        int c = location[1];
        int height = location[2];
        map[r][c] = height;
        visited[r][c] = 1;

        int[][] arr = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        for (int i = 0; i < arr.length; i++) {
            int targetRow = r + arr[i][0];
            int targetColumn = c + arr[i][1];
            if (targetRow > 0 && targetRow < map.length &&
                targetColumn > 0 && targetColumn < map[0].length &&
                visited[targetRow][targetColumn] == 0
            ){
                map[targetRow][targetColumn] = height + 1;
                visited[targetRow][targetColumn] = 1;
                queue.add(new int[]{targetRow, targetColumn, height + 1});
            }
        }
        return queue;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int x = sc.nextInt();
//        int y = sc.nextInt();
        int n = 10;
        int x = 5;
        int y = 5;

        int[][] map = new int[n+1][n+1];
        int[][] visited = new int[n+1][n+1];
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y, 1});
        while (!queue.isEmpty()) {
            queue = dfs(visited, map, queue);
        }

        print2xArr(map);
    }
}
