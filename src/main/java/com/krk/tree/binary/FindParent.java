package com.krk.tree.binary;

public class FindParent {
    public static int goUp(int a, int b) {
        if(a > b) {
            return goUp(a / 2, b) + 1; // a를 부모 쪽으로
        } else if (a < b) {
            return goUp(a, b / 2) + 1; // b를 부모 쪽으로
        } else { // a == b
            return 0;
        }
    }
    public static void main(String[] args) {
        System.out.println(goUp(3, 4));
        System.out.println(goUp(9, 3)); // 4
    }
}
