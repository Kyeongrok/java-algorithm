package com.krk.stack;

import java.util.ArrayDeque;
import java.util.Queue;

public class Printer {
    public int solution(int[] priorities, int location) {
        // location 2
        // queue에 넣어놓고 .poll()을 하고 .peek()과 비교해서
        var maxPriority = priorities[0];
        for (int i = 1; i < priorities.length; i++) {
            if(maxPriority < priorities[i]) maxPriority = priorities[i];
        }

        Queue<Integer> queue = new ArrayDeque<>();
        // queue에 모두 넣기
        for (int i = 0; i < priorities.length; i++) {
            queue.add(priorities[i]);
        }
        // maxPriority보다 작으면 .poll후 .push 언제까지? location까지
        while (queue.peek() < maxPriority) {
            if(queue.peek() < maxPriority) queue.add(queue.poll());
        }
        // 2 1 3 2라면 3 2 2 1

        return 0;
    }
    public static void main(String[] args) {
        // 1113, 3111
        Printer printer = new Printer();
        printer.solution(new int[]{2, 1, 3, 2}, 2);
        printer.solution(new int[]{2, 1, 3, 2}, 2);

    }
}
