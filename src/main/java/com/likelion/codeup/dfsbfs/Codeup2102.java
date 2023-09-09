package com.likelion.codeup.dfsbfs;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Codeup2102 {
    // https://codeup.kr/problem.php?id=2102

    public static void bfs(Queue<String> queue, String targetNum) {
        Queue<String> queue2 = new LinkedList<>();
        while (!queue.isEmpty()) {
            BigInteger n = new BigInteger(queue.poll());
            System.out.println(n);
            if(!n.mod(new BigInteger(targetNum)).equals(0)){
                queue2.add(n + "0");
                queue2.add(n + "1");
            } else {
                System.out.println(n);
                return;
            }
        }
        bfs(queue2, targetNum);
    }
    public static void main(String[] args) {
//        int targetNum = 3;
        Scanner sc = new Scanner(System.in);
//        String targetNum = sc.nextLine();
        Queue<String> queue = new LinkedList<>();
        queue.add("1");
//        bfs(queue, targetNum);
        // ToDo: 미완성k

    }
}
