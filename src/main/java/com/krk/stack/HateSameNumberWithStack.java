package com.krk.stack;

import java.util.Stack;

public class HateSameNumberWithStack {
    public int[] solution(int[] arr) {
        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if(st.peek() != arr[i]) st.push(arr[i]);
        }
        var answer = new int[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            answer[i] = st.pop();
        }
//        System.out.println(Arrays.toString(answer));
        return answer;
    }

    public static void main(String[] args) {
        var arr = new int[]{1, 1, 3, 3, 0, 1, 1};
    }
}
