package com.likelion.tree.binary;

public class BinarySearchTree {
    public static int LCA(int a, int b) {
        if(a == b){
            return 0;
        } else if (a < b) {
            return LCA(a, b / 2) + 1;
        } else {
            return LCA(a/2, b ) + 1;
        }
    }
    public static void main(String[] args) {
        // 2 3 1 을 트리에 저장
        System.out.println(LCA(3,4));

    }
}
