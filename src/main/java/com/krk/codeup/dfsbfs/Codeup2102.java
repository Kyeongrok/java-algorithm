package com.krk.codeup.dfsbfs;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Queue;

public class Codeup2102 {
    /*
    배수 (Hard)
    https://codeup.kr/problem.php?id=2102
     */
    public static BigInteger boolToBigint(boolean[] ba) {
        String str = "";
        for (int i = 0; i < ba.length; i++) {
            str = ba[i]?"1":"0" + str;
        }
        return new BigInteger(str);
    }
    public static void bfs(Queue<String> queue, String targetNum) {
        Queue<String> queue2 = new LinkedList<>();
        while (!queue.isEmpty()) {
            BigInteger n = new BigInteger(queue.poll());
//            System.out.println(n);
            if(n.mod(new BigInteger(targetNum)).intValue() != 0){
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
        String targetNum = "396";
//        Scanner sc = new Scanner(System.in);
//        String targetNum = sc.nextLine();
        Queue<String> queue = new LinkedList<>();
        queue.add("1");
        bfs(queue, targetNum);
        // ToDo: 미완성k

//        System.out.println(new BigInteger("111").mod(new BigInteger("3")));

    }
}
