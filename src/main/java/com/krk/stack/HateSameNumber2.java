package com.krk.stack;

import java.util.Arrays;

public class HateSameNumber2 {
    public int[] solution(int []arr) {

        int[] brr = new int[arr.length];

        brr[0] = arr[0];
        int cnt = 1;
        for(int i = 1; i < arr.length; i++){
            if(brr[cnt-1] != arr[i]){
                brr[cnt] = arr[i];
                cnt++;
            }
        }
        int[] answer = new int[cnt];
        for(int i = 0; i < cnt; i++){
            answer[i] = brr[i];
        }
        return answer;
    }
    public static void main(String[] args) {
        HateSameNumber2 hsn = new HateSameNumber2();
        var arr = new int[]{1, 1, 3, 3, 0, 1, 1};
        System.out.println(Arrays.toString(hsn.solution(arr)));
    }
}
