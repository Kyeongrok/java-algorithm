package com.likelion.hash;

import java.util.HashSet;
import java.util.Set;

public class PhoneNumList {
    public boolean solution(String[] phone_book) {
        Set<String> set = new HashSet<>();
        for(var phone: phone_book) set.add(phone);

        for (int i = 0; i < phone_book.length; i++) {
            for (int j = 0; j < phone_book[i].length(); j++) {
                if(set.contains(phone_book[i].subSequence(0, j))) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
