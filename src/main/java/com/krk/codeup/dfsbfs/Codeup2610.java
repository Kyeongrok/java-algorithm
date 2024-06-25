package com.krk.codeup.dfsbfs;

import java.util.Scanner;

public class Codeup2610 {
    /*
    0123456789
    0__________
    1_____****_
    2_____*__*_
     */
    public static char[][] initPicture() {
        String[] p = {
            "__________",
            "_____****_",
            "_____*__*_",
            "__*******_",
            "__*__*_**_",
            "__*__****_",
            "__*____*__",
            "__*____*__",
            "__******__",
            "__________"
        };
        return new char[][]{};
    }
    public static void dfs(int r, int c, char[][] picture, int[][] visited) {

        visited[r][c] = 1;
        picture[r][c] = '*';

        int[][] directions = new int[][]{{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
        for (int i = 0; i < directions.length; i++) {
            int nextRow = r + directions[i][0];
            int nextColumn = c + directions[i][1];
            if(nextRow >= 0 && nextRow < picture.length &&
                    nextColumn >= 0 && nextColumn < picture.length &&
                    picture[nextRow][nextColumn] == '_' && visited[nextRow][nextColumn] == 0) {
                visited[nextRow][nextColumn] = 1;
                picture[nextRow][nextColumn] = '*';
                dfs(nextRow, nextColumn, picture, visited);
            }
        }
    }

    public static void main(String[] args) {

        char[][] picture = new char[10][10];
        int[][] visited = new int[10][10];

        // picture초기화
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < picture.length; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < picture.length; j++) {
                picture[i][j] = line.charAt(j);
            }
        }

        int c = sc.nextInt();
        int r = sc.nextInt();

        if(picture[r][c] == '_') dfs(r, c, picture, visited);

        // 출력
        for (int i = 0; i < picture.length; i++) {
            for (int j = 0; j < picture.length; j++) {
                System.out.printf("%c", picture[i][j]);
            }
            System.out.println();
        }

    }
}
