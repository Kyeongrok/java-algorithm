package com.krk.tree.binary;

import java.util.LinkedList;

// https://www.interviewbit.com/problems/stairs/
public class BinaryTree2 {
    public static int climbStairs(int A) {

        if(A < 0) return 0;
        if(A == 0) return 1;
        return climbStairs(A - 1) + climbStairs(A - 2);
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }

}
