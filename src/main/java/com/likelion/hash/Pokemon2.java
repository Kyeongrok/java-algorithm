package com.likelion.hash;

import java.util.HashSet;
import java.util.Set;

public class Pokemon2 {

    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        // 중복을 없애기 위해 [3,2,1,2] --> [3,2,1]
        int N = nums.length / 2; // ex)5 int or float 2 vs 2.5

        // set개수와 N중에서 하나를 return합니다.
        // length 6개 N = 3 [333222]
        if (set.size() < N) {
            return set.size();
        } else {
            return N;
        }
    }


    public static void main(String[] args) {

    }
}
