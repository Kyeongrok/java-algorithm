package com.krk.codeup.dfsbfs;

import java.io.*;
import java.util.Stack;

public class Codeup3122 {
    /*
        n   n*2 - 1     center(n - 1)
        2       3       1, 1
        3       5       2, 2
        4       7       3, 3
        6       13      5, 5
     */
    public static void printArr(int[][] visited) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < visited.length; i++) {
//            System.out.println(Arrays.toString(visited[i]));
            for (int j = 0; j < visited.length; j++) {
                if (visited[i][j] == 1) {
                    bw.write('*');
                } else {
                    bw.write(' ');
                }
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }

    public static void printArrToFile(int[][] visited, String fileName) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));

        for (int i = 0; i < visited.length; i++) {
            for (int j = 0; j < visited[i].length; j++) {
                if (visited[i][j] == 1) {
                    bw.write('*');
                } else {
                    bw.write(' ');
                }
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }

    public static void dfs(Stack<int[]> st, int[][] visited, int depth) {
        int[][] directions = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        Stack<int[]> st2 = new Stack<>();
        while(!st.isEmpty()){
            int[] location = st.pop();
            int r = location[0];
            int c = location[1];
            for (int i = 0; i < directions.length; i++) {
                int nextRow = r + directions[i][0];
                int nextColumn = c + directions[i][1];
                if(nextRow >= 0 && nextRow < visited.length &&
                        nextColumn >= 0 && nextColumn < visited.length &&
                        visited[nextRow][nextColumn] == 0
                        ){
//                    System.out.printf("depth:%d r:%d c:%d\n", depth, nextRow, nextColumn);
                    visited[nextRow][nextColumn] = 1;
                    st2.push(new int[]{nextRow, nextColumn});
                }
            }
        }
        if(depth < visited.length / 2 - 1) dfs(st2, visited, depth + 1);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        int n = Integer.parseInt(bf.readLine());
//        int n = 2;
//        int n = sc.nextInt();
        int columns = n * 2 - 1;

        int visited[][] = new int[columns][columns];
        visited[n-1][n-1] = 1;

        Stack<int[]> st = new Stack<>();
        st.push(new int[]{n - 1, n - 1});
        dfs(st, visited, 0);
        printArr(visited);
//        printArrToFile(visited, "output.txt");
//        for (int i = 0; i < visited.length; i++) {
//            System.out.println(Arrays.toString(visited[i]));
//        }

    }
}
