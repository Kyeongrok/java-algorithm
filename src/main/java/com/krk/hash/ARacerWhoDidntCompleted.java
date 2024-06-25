package com.krk.hash;

import java.util.HashMap;
import java.util.Map;

public class ARacerWhoDidntCompleted {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> hm = new HashMap<>();

        for (int i = 0; i < participant.length; i++) {
            hm.put(participant[i], 1);
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
}
