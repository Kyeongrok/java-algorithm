package com.krk.hash;

public class ARacerWhoArrayNested {

    public String solution(String[] participant, String[] completion) {
        for (int i = 0; i < participant.length; i++) {
            String name = participant[i];
            int nameCnt = 0;
            for (int j = 0; j < completion.length; j++) {
                if (name == completion[j]) {
                    nameCnt += 1;
                }
            }
            if (nameCnt == 0 || nameCnt == 2) {
                return name;
            }
        }
        return "";
    }

    public static void main(String[] args) {
        ARacerWhoArrayNested arw = new ARacerWhoArrayNested();
        var r1 = arw.solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"});
        var r2 = arw.solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}, new String[]{"josipa", "filipa", "marina", "nikola"});
        System.out.println(r1);
        System.out.println(r2);
    }
}
