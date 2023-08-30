package com.likelion.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution42Dot01 {
    /*
    card [
    A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
    2 2 2 2
                            4 4
                                    4      4
    ]

    location
    A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
    1  1 1 1              2 2    3  3

    word
    A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
    3                         5    5

     */
    int[] alphabetsCount = new int[26];
    int[] alphabetsLocation = new int[26];

    public boolean isValid(String word){

        int[] usedMemo = new int[4];
        for (int j = 0; j < word.length(); j++) {
            char c = word.charAt(j);
            if(alphabetsCount[c - 65] > 0){
                alphabetsCount[c - 65]--;
                usedMemo[alphabetsLocation[c - 65]]++;
            } else {
                return false;
            }
        }

        for (int i = 1; i < usedMemo.length; i++) {
            if(usedMemo[i] < 1) return false;
        }

        return true;
    }
    public void initMemo(String[] card) {
        // "ABACDEFG"를 count와 location 배열에 담는다.
        this.alphabetsCount = new int[26];
        this.alphabetsLocation = new int[26];
        for (int i = 0; i < card.length; i++) {
            for (int j = 0; j < card[i].length(); j++) {
                alphabetsCount[card[i].charAt(j) - 65] ++;
                alphabetsLocation[card[i].charAt(j) - 65] = i + 1;
            }
        }
    }
    public String[] solution(String[] card, String[] word) {

        List<String> answers = new ArrayList<>();
        // count와 location을 참고하여 가능한지 check
        for (int i = 0; i < word.length; i++) {
            // memo초기화
            initMemo(card);

            // isValid
            if(isValid(word[i])){
//                System.out.println(word[i]);
                answers.add(word[i]);
            }
        }

        // 없으면 -1리턴
        if(answers.size() == 0) return new String[]{"-1"};

        // valid한 값들 리턴
        String[] answer = new String[answers.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = answers.get(i);
        }

        return answer;
    }
    public static void main(String[] args) {

        // 배열에 있으면 1개를 차감한다. 없으면 false
        Solution42Dot01 s = new Solution42Dot01();
        String[] a1 = s.solution(new String[]{"ABACDEFG", "NOPQRSTU", "HIJKLKMM"}, new String[]{"GPQM", "GPMZ", "EFU", "MMNA"});
        String[] a2 = s.solution(new String[]{"AABBCCDD", "KKKKJJJJ", "MOMOMOMO"}, new String[]{"AAAKKKKKMMMMM", "ABCDKJ"});
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
    }
}
