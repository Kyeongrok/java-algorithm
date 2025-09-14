package com.programmers;

import java.util.Stack;


class Node {
    public Node(int sum, int index) {
        this.sum = sum;
        this.index = index;
    }
    int sum;
    int index;
}

class Solution {
    public int solution(int[] arr, int target) {

//        System.out.println(Arrays.toString(arr));

        Stack<Node> st = new Stack<>();
        st.push(new Node(0, 0));

        int count = 0;

        while (!st.empty()){
            Node node = st.pop();
//            System.out.printf("sum:%d index:%d\n", node.sum, node.index);
            if(node.index == arr.length) {
                if(node.sum == target) count++;
            } else {
                st.push(new Node(node.sum + arr[node.index], node.index + 1));
                st.push(new Node(node.sum - arr[node.index], node.index + 1));
            }
        }

        return count;
    }
}

public class Programmers43165 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(new int[]{1, 1, 1, 1, 1}, 3);
        System.out.println(result);
    }
}
