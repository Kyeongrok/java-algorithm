package com.krk.prime;

public class PrimeDivideUntil {

    // Template callback
    boolean isPrime(int num) {
        // num = 13이니까 12까지 나누어 봅니다.
        for (int i = 2; i < num; i++) {
            if(num % i != 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        PrimeDivideUntil pdu = new PrimeDivideUntil();
        pdu.isPrime(13);

    }

}
