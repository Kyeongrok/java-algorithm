package com.krk.gcd;

public class GCDStep2 {
    public static void main(String[] args) {

        // a를 b로 나누었을 때 나머지를 r이라고 하면 r과 b의 최대공약수와 a와 b의 최대공약수는 같다는 알고리즘 입니다.
        int a = 12;
        int b = 192;

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
}
