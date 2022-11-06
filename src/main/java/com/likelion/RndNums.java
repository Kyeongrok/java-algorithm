package com.likelion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RndNums {
    public static void main(String[] args) {
        int[] arr = new int[1_000_000_000];

        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(2_000_000_000);
        }
        System.out.println("생성 완료");

        for (int i = 0; i < arr.length; i++){
            if(arr[i] == 1999) System.out.println("찾았다");
        }

    }
}
