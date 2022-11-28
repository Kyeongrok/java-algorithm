package com.likelion.recursive;

import java.util.Stack;

public class RemoveRecursive3 {
    public static void recur(int n) {
        Stack<Integer> st = new Stack<>();
        while(true){
            if (n > 0) {
                st.push(n--);
                continue;
            }
            if (!st.isEmpty()) {
                n = st.pop();
                System.out.println(n);
                n = n - 2;
                continue;
            }
            break;
        }
    }
    public static void main(String[] args) {
        recur(3);
    }
}
