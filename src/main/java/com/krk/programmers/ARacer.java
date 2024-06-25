package com.krk.programmers;

import java.util.HashMap;
import java.util.Map;

public class ARacer {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> memo = new HashMap<>();
        for (String key : participant) {
            memo.put(key, memo.getOrDefault(key, 0) + 1);
        }
        for (int i = 0; i < completion.length; i++) {
            String key = completion[i]; // value 1
            memo.put(key, memo.get(key) - 1);
        }
        for (String key : memo.keySet()) {
            if (memo.get(key) == 1) {
                return key;
            }
        }
        return "";
    }

    public static void main(String[] args) {
        ARacer arw = new ARacer();
        var r1 = arw.solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"});
        var r2 = arw.solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}, new String[]{"josipa", "filipa", "marina", "nikola"});
        var r3 = arw.solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"});
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

    }
}
