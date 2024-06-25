package com.krk.hash;

import java.util.HashMap;
import java.util.Map;

public class ARacerWhoDidntCompleted02 {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> hm = new HashMap<>();

        for (int i = 0; i < participant.length; i++) {
            if(!hm.containsKey(participant[i])){
                hm.put(participant[i], 0);
            }
            hm.put(participant[i], hm.get(participant[i]) + 1);
        }
        for (int i = 0; i < completion.length; i++) {
            hm.put(completion[i], hm.get(completion[i]) - 1);
        }

        String answer = null;
        for (String key : hm.keySet()) {
            if (hm.get(key) == 1) {
                answer = key;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        ARacerWhoDidntCompleted02 arw = new ARacerWhoDidntCompleted02();
        var r1 = arw.solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"});
        var r2 = arw.solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}, new String[]{"josipa", "filipa", "marina", "nikola"});
        var r3 = arw.solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"});
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }
}
