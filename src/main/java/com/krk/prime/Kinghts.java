package com.krk.prime;

public class Kinghts {
    public static int isPrime(int n, int limit, int power) {
        int cntOfDivisor = 0;
        for (int i = 2; i * i <= n; i++) {
            if(n % i != 0){
                // 소수가 아니면
                return cntOfDivisor;
            }
        }
        return power;
    }
    public static int cntOfDivisor(int n, int limit, int power) {
        for (int i = 2; i * i <= n; i++) {
        }
        return 2;
    }
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for (int i = 1; i <= number; i++) {
            // prime이 아니라면 limit 이하까지 약수의 개수를 구한다
            // limit을 초과하면 power를 더한다

        }
        return answer;
    }
    public static void main(String[] args) {


    }
}
