package com.krk.remainder;

public class SumOfDivisor {
    public int solution(int num) {
        int answer = 0;
        for (int i = 1; i <= num; i++) {
            if (Math.floorMod(num, i) == 0) {
                answer += i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int r = new SumOfDivisor().solution(12);
        System.out.println(r);
    }
}
