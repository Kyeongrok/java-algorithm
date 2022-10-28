package com.likelion.hash;


import java.util.HashSet;

public class PhoneBookExercise {
    public boolean solution(String[] nums) {

        HashSet<String> hs = new HashSet<>();
        for (String num : nums) hs.add(num);

        // hashset에서 한개씩 뽑아서 ex) 12348765
        // 1
        // 12
        // 123
        // 1234
        // 12348
        // 123487
        //...
        // 12348765 를 hs에서 검색

        return false;
    }
    public static void main(String[] args) {
        System.out.println("123".indexOf("12"));
    }
}
