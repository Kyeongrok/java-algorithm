package com.krk.gcd;

import java.util.Scanner;

public class GCDStep3 {

    public static void main(String[] args) {

        // a를 b로 나누었을 때 나머지를 r이라고 하면 r과 b의 최대공약수와 a와 b의 최대공약수는 같다는 알고리즘 입니다.
        int a = 196;
        int b = 42;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(gcd(a, b));
    }
    public static int gcd(int a, int b) {

        // a > 1인 동안 반복 해줍니다.
        // 나머지가 1이 나올 때 까지 반복한다는 뜻 입니다.
        while(a > 1){
            // 더 큰 값이 있다면 자리를 바꿉니다.
            if(a < b) {
                int temp = a;
                a = b;
                b = temp;
            }

            // a, b의 최대 공약수는
            int r = a % b; // 나머지를 구해주고
            a = r; // a에 r을 대입 해줍니다.
        }
        if(a == 0) {
            return b;
        } else {
            return a;
        }
    }
}
