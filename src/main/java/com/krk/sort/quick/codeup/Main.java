package com.krk.sort.quick.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static int[] quickSort(int[] arr, int startIdx, int endIdx) {
        int leftIdx = startIdx;
        int rightIdx = endIdx;
        int pivot = arr[(startIdx + endIdx) / 2];
        while(leftIdx <= rightIdx){
            while(arr[leftIdx] < pivot) leftIdx += 1;   // <=아닙니다.
            while(arr[rightIdx] > pivot) rightIdx -= 1;   // <=아닙니다.

            if(leftIdx <= rightIdx){
                int temp = arr[leftIdx];
                arr[leftIdx] = arr[rightIdx];
                arr[rightIdx] = temp;
                leftIdx += 1;
                rightIdx -= 1;
            }
        }

        if(startIdx < rightIdx) quickSort(arr, startIdx, rightIdx);
        if(leftIdx < endIdx) quickSort(arr, leftIdx, endIdx);

        return arr;
    }
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        int n = Integer.parseInt(bf.readLine());
        String sArr = bf.readLine();
        sArr += " ";

        int[] arr = new int[n];
        int idx = 0;
        String num = "";
        for (int i = 0; i < sArr.length(); i++) {
            if (' ' == sArr.charAt(i)) {
                arr[idx] = Integer.parseInt(num);
                num = "";
                idx ++;
            } else {
                num += sArr.charAt(i);
            }
            // 공백이 나올때까지 저장 공백이
            // 나오면 초기화 하고 idx를 늘림
        }

        int[] answer = quickSort(arr, 0, n - 1);
        for (int i = 0; i < answer.length; i++) {
            System.out.printf("%d ", answer[i]);
        }
    }
}
