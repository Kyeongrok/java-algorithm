package com.krk.prime;

public class Sieve {

    //        Comparator<Integer> comparator = (a, b) -> a + b;
    //        Predicate<Integer> predicate = (a) -> a < 10;
    public int[] getPrims(int N) {
        int[] nums = new int[N - 1]; // 2 ~ N까지 0~99가 100개 1~100이 100개 // 2에서 100까지가 99개
        for (int i = 0; i <= nums.length - 2; i++) {
            nums[i] = 2+i;
        }
        boolean[] check = new boolean[N - 1];

        System.out.println(check[0]);

        int i = 0;
        while (nums[i] * nums[i] <= N) {
            if(!check[i]){
                for (int j = 0; j < nums[i] + i; j++) {
                    
                }
            }
            i += 1;
        }

        return new int[0];
    }
    public static void main(String[] args) {
        Sieve sieve = new Sieve();
        sieve.getPrims(10);

    }
}
