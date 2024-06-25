package com.krk.codility;

public class Solution5 {

    public static boolean isMagicSquare(int[][] matrix) {

        int n = matrix.length;

        // 첫번째 행의 합
        int firstRowSum = 0;
        for (int ci = 0; ci < n; ci++) {
            firstRowSum += matrix[0][ci];
        }

        // 행의 합 검사
        for (int i = 1; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += matrix[i][j];
            }
            if (rowSum != firstRowSum) return false;
        }

        // 열의 합 검사
        for (int j = 0; j < n; j++) {
            int colSum = 0;
            for (int i = 0; i < n; i++) {
                colSum += matrix[i][j];
            }
            if (colSum != firstRowSum) {
                return false;
            }
        }

        // 첫번째 대각선 합
        int firstDiagonalSum = 0;
        for (int i = 0; i < n; i++) {
            firstDiagonalSum += matrix[i][i];
        }
        if (firstDiagonalSum != firstRowSum) {
            return false;
        }

        // 두번째 대각선 합
        int antiDiagonalSum = 0;
        for (int i = 0; i < n; i++) {
            antiDiagonalSum += matrix[i][n - 1 - i];
        }
        if (antiDiagonalSum != firstRowSum) {
            return false;
        }

        return true;
    }

    public static void printSquareSubmatrix(int[][] matrix, int startRow, int startCol, int size) {
        for (int i = startRow; i < startRow + size; i++) {
            for (int j = startCol; j < startCol + size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] createSquareSubmatrix(int[][] matrix, int startRow, int startCol, int size) {
        int[][] submatrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                submatrix[i][j] = matrix[startRow + i][startCol + j];
            }
        }
        return submatrix;
    }

    public int solution(int[][] A) {
        int rows = A.length;
        int cols = A[0].length;

        // 모든 2차원 matrix찾기
        for (int size = Math.min(rows, cols); size > 0 ; size--) {
            for (int startRow = 0; startRow <= rows - size; startRow++) {
                for (int startCol = 0; startCol <= cols - size; startCol++) {
//                    printSquareSubmatrix(A, startRow, startCol, size);
                    boolean isTrue = isMagicSquare(createSquareSubmatrix(A, startRow, startCol, size));
//                    System.out.printf("-size:%d--r:%d--c:%d %b--\n", size, startRow, startCol, isTrue);
                    if (isMagicSquare(createSquareSubmatrix(A, startRow, startCol, size))) return size;
                }
            }
        }
        return 1;

    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 4, 3, 4, 5, 3 },
                { 2, 7, 3, 8, 4 },
                { 1, 7, 6, 5, 2 },
                { 8, 4, 9, 5, 5 }
        };

        Solution5 solution5 = new Solution5();
        System.out.println(solution5.solution(matrix));
        System.out.println(solution5.solution(new int[][]{{2,2,1,1}, {2,2,2,2}, {1,2,2,2}}));
        System.out.println(solution5.solution(new int[][]{{7,2,4}, {2,7,6}, {9,5,1}, {4,3,8}, {3,5,4}}));
        System.out.println(solution5.solution(new int[][]{{7}}));
    }
}
