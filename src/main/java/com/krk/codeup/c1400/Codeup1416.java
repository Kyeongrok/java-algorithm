package com.krk.codeup.c1400;

import java.util.Scanner;
import java.util.Stack;

public class Codeup1416 {
    // convert to binary num
    public static void main(String[] args) {

        int n = 10; // 1010

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        Stack<Integer> stack = new Stack<>();

        do {
            stack.push(n % 2);
            n /= 2;
        } while (n > 0);

        while (!stack.isEmpty()) {
            System.out.printf("%d", stack.pop());
        }

    }
}
