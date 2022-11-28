package com.likelion.sort.radix1;

import java.util.ArrayDeque;
import java.util.Queue;

public class RadixSort2 {
    public static void main(String[] args) {
//        var rnd = new Random();
//        for (int i = 0; i < 20; i++) {
//            System.out.printf("%d,", rnd.nextInt(20));
//        }
        int[] arr = new int[]{7, 4, 5, 9, 1, 0};
        arr = new int[]{2, 8, 18, 13, 1, 7, 16, 7, 0, 14};

        // Queue 10개 생성
        Queue<Integer>[] queueArr = new Queue[10];
        for (int i = 0; i < queueArr.length; i++) {
            queueArr[i] = new ArrayDeque<>();
        }
        // 일의 자리가 맞는 곳에 넣는다
        for (var i : arr) {
            queueArr[i].add(i);
        }

        for (int i = 0; i < queueArr.length; i++) {
            while(!queueArr[i].isEmpty()){
                System.out.printf("%d|", queueArr[i].poll());
            }
        }
    }
}
