package com.likelion.prime;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RemoveMultipleOfList2 {
    public int solution(int N) {
        List<Integer> nums = new LinkedList<>();
        for (int i = 2; i <= N; i++) nums.add(i);

        // 4부터 2의 배수 지우기 2는 prime이므로 지우면 안됨
        for (int j = 2; j * j <= N; j++) {
            int multipleOf = j;
            for (int i = 0; i < nums.size(); i++) {
                if(nums.get(i) % multipleOf == 0 && nums.get(i) > multipleOf) nums.remove(i);
            }
        }
        return nums.size();
    }
    public static void main(String[] args) {

    }
}
