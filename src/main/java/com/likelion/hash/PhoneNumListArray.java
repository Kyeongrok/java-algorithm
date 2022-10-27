package com.likelion.hash;

import java.util.HashSet;
import java.util.Set;

public class PhoneNumListArray {
    public boolean solution(String[] phone_book) {

        for (int i = 0; i < phone_book.length; i++) {
            int cnt = 0;
            for (int j = 0; j < phone_book.length; j++) {
                if (phone_book[i].contains(phone_book[j])) {
                    cnt += 1;
                }
            }
            if(cnt > 1) return false;
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
