package com.krk.hash;

public class PhoneNumListArray {
    public boolean solution(String[] phone_book) {
        // 통과는 하지만 속도에서 틀린다
        for (int i = 0; i < phone_book.length; i++) {
            int cnt = 0;
            for (int j = 0; j < phone_book.length; j++) {
                if (phone_book[i].indexOf(phone_book[j]) == 0) {
                    cnt += 1;
                }
                if(cnt > 1) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
