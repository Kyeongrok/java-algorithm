package com.krk.hash;

import java.util.HashSet;
import java.util.Set;

public class Pokemon {
    public int solution(int[] nums) {
        var N = nums.length / 2;
        // 4마리 중 2마리
        // 6마리 중 3마리
        // 8마리 중 4마리
        // set에 넣은 후에 Set의 원소 개수가 N보다 작으면 set의 원소 개수 아니면 N을 리턴
        Set<Integer> set = new HashSet<>();
        for(var num : nums) set.add(num);

        if (set.size() < N) {
            return set.size();
        } else {
            return N;
        }
    }

    public static void main(String[] args) {
        var r = new Pokemon().solution(new int[]{3, 1, 2, 3});
        var r2 = new Pokemon().solution(new int[]{3,3,3,2,2,4});
        var r3 = new Pokemon().solution(new int[]{3,3,3,2,2,2});

        System.out.println(r);
        System.out.println(r2);
        System.out.println(r3);

    }
}
