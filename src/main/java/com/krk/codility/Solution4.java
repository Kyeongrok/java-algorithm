package com.krk.codility;

public class Solution4 {
    /*
     "...X..",
     "....XX",
     "..X..."
     */

    public static int solution(String[] R) {

        int numRows = R.length;
        int numCols = R[0].length();

        // 방향은 북, 서, 남, 동
        int[][] directions = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};

        // 시작 위치 설정
        int currentRow = 0;  // 시작 행
        int currentCol = 0;  // 시작 열
        int currentDir = 3;  // 시작 방향 (동쪽)

        int[][] result = new int[numRows][numCols];  // 결과 그리드 생성

        // 지나갈 수 있는 칸을 1로 표시
        int cnt = 0;
        while (true) {
            result[currentRow][currentCol] = 1;

            // 다음 위치 계산
            int newRow = currentRow + directions[currentDir][0];
            int newCol = currentCol + directions[currentDir][1];

            // 다음 위치가 유효한 범위 내이며 X가 아닌 경우 이동
            if (newRow >= 0 && newRow < numRows && newCol >= 0 && newCol < numCols && R[newRow].charAt(newCol) != 'X') {
                currentRow = newRow;
                currentCol = newCol;
                // X를 만나면 왼쪽으로 회전
            } else {
                currentDir = (currentDir + 3) % 4;  // 90도 회전
            }

            cnt++;

            // 시작 위치로 돌아오면 종료
            if (cnt == 400) {
                break;
            }
        }

        // 결과 출력
        int floorCnt = 0;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
//                System.out.print(result[i][j] + " ");
                floorCnt += result[i][j];
            }
//            System.out.println();
        }
        return floorCnt;
    }
    public static void main(String[] args) {
        String[] R = {"...X..","....XX","..X..."};
        System.out.println(solution(R));
        System.out.println(solution(new String[]{"....X..", "X......", ".....X.", "......."}));
        System.out.println(solution(new String[]{"...X.", ".X..X", "X...X", "..X.."}));
    }
}
