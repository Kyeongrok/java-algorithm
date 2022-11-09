package com.likelion.stack;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class HateSameNumber {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        var arr = new int[]{1, 1, 3, 3, 0, 1, 1};

        st.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] != st.peek()) st.push(arr[i]);
        }

        var answer = new int[st.size()];
        for (int i = st.size() - 1; i >= 0 ; i--) {
            answer[i] = st.pop();
            System.out.println(answer[i]);
        }
//        System.out.println(Arrays.toString(answer));
    }
}
