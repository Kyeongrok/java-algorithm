package com.likelion.prime;

import java.util.HashSet;
import java.util.Set;

public class RemoveMultipleOfSet {
    public static void main(String[] args) {
        int N = 50;
        Set<Integer> set = new HashSet<>();
        for (int i = 2; i <= N; i++) set.add(i);
        System.out.println(set);

        // 4부터 2의 배수 지우기 2는 prime이므로 지우면 안됨
        for (int i = 2; i*i <= N; i++) {
            for (int j = i; j <= N; j++) {
                if(i != j) set.remove(j);
            }
            System.out.println(set);
        }
    }
}
