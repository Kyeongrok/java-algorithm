package com.likelion.programmers;

import java.util.*;

public class Solution42Dot03 {
    public static int[][] binTree = new int[][]{{1, 2}, {3, 4}, {-1, -1}, {-1, -1}, {-1, -1}};

    public static void printCombinations(int node, boolean leftValue, boolean rightValue, String combination) {
        if (node == -1) {
            System.out.println(combination); // Print the current combination
            return;
        }

        int leftChild = binTree[node][0];
        int rightChild = binTree[node][1];

        if (leftChild == -1 || rightChild == -1) {
            // Try placing leftValue in the current node if left child is missing
            if (leftChild == -1) {
                printCombinations(leftChild, false, rightValue, combination + " " + (leftValue ? "1" : "2"));
            }

            // Try placing rightValue in the current node if right child is missing
            if (rightChild == -1) {
                printCombinations(rightChild, leftValue, false, combination + " " + (rightValue ? "1" : "2"));
            }
        } else {
            // Try placing leftValue in the current node
            printCombinations(leftChild, false, rightValue, combination + " " + (leftValue ? "1" : "2"));

            // Try placing rightValue in the current node
            printCombinations(rightChild, leftValue, false, combination + " " + (rightValue ? "1" : "2"));
        }
    }

    public static void main(String[] args) {
        System.out.println("All possible value combinations:");
        printCombinations(0, false, false, ""); // Start from the root node (node 0)
    }
}
