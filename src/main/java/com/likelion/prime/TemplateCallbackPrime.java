package com.likelion.prime;

import java.util.Comparator;
import java.util.function.Predicate;

interface StatementStrategy {
    boolean compare(long a, long b);
}

public class TemplateCallbackPrime {
    boolean isPrime(long num, StatementStrategy stmt) {
        for (int i = 2; stmt.compare(i, num); i++) {
//            System.out.println(i);
            if(num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        TemplateCallbackPrime tcp = new TemplateCallbackPrime();
        int n = 1_000_000_000;
        int cnt = 0;
        for (int i = 2; i < n; i++) {
            if(tcp.isPrime(n , (a, b)-> a * a < b)) cnt+=1;
        }
        System.out.println(cnt);
    }
}
