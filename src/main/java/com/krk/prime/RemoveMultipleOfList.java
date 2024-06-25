package com.krk.prime;

import java.util.ArrayList;
import java.util.List;

public class RemoveMultipleOfList {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        for (int i = 2; i <= 50; i++) nums.add(i);

        // 4부터 2의 배수 지우기 2는 prime이므로 지우면 안됨
        int multipleOf = 2;
        for (int i = 0; i < nums.size(); i++) {
            if(nums.get(i) % multipleOf == 0 && nums.get(i) > multipleOf) nums.remove(i);
        }
        System.out.println(nums);
        System.out.println(nums.size());
        multipleOf = 3;
        for (int i = 0; i < nums.size(); i++) {
            if(nums.get(i) % multipleOf == 0 && nums.get(i) > multipleOf) nums.remove(i);
        }
        System.out.println(nums);
        System.out.println(nums.size());
    }
}
