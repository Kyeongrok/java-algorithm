package com.krk.stack;

import java.util.Arrays;
import java.util.Stack;

public class HateSameNumberStack {

    public int[] solution(int[] arr) {
        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);
        // 비교해서 stack에 넣기
        for (int i = 1; i < arr.length; i++) {
            if(st.peek() != arr[i]) st.push(arr[i]);
        }

        var answer = new int[st.size()];
        System.out.println(Arrays.toString(answer));
        // 거꾸로 꺼내기
        for (int i = st.size() - 1; i >=0 ; i--) {
            answer[i] = st.pop();
        }

        return answer;
    }
    public static void main(String[] args) {
        var arr = new int[]{1, 1, 3, 3, 0, 1, 1};
        HateSameNumberStack hsn = new HateSameNumberStack();
        hsn.solution(arr);

    }
}
