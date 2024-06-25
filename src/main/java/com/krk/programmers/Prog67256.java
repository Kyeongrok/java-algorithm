package com.krk.programmers;

import java.util.HashMap;
import java.util.Map;

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Prog67256 {
    Map<Integer, Point> phoneKeyPad = new HashMap<>();


    public Prog67256() {
        phoneKeyPad.put(1, new Point(0, 0))
        ;
        phoneKeyPad.put(2, new Point(0, 1));
        phoneKeyPad.put(3, new Point(0, 2));
        phoneKeyPad.put(4, new Point(1, 0));
        phoneKeyPad.put(5, new Point(1, 1));
        phoneKeyPad.put(6, new Point(1, 2));
        phoneKeyPad.put(7, new Point(2, 0));
        phoneKeyPad.put(8, new Point(2, 1));
        phoneKeyPad.put(9, new Point(2, 2));
        phoneKeyPad.put(11, new Point(3, 0));
        phoneKeyPad.put(0, new Point(3, 1));
        phoneKeyPad.put(12, new Point(3, 2));

    }

    public static int getDistance(int p1x, int p1y, int p2x, int p2y) {
        int cnt = 0;
        while (p1x != p2x || p1y != p2y) {
            if (p1x > p2x) {
                p1x--;
            } else if (p1x < p2x){
                p1x++;
            } else if (p1y > p2y){
                p1y--;
            } else if (p1y < p2y){
                p1y++;
            }
            cnt++;
        }
        return cnt;
    }

    public char whichHand(String userHand, int targetNum, int leftHandLocation, int rightHandLocation) {

        if (targetNum == 1 | targetNum == 4 | targetNum == 7) {
            return 'L';
        } else if (targetNum == 3 | targetNum == 6 | targetNum == 9) {
            return 'R';
        } else {
            Point t = phoneKeyPad.get(targetNum);
            Point pLeft = phoneKeyPad.get(leftHandLocation);
            Point pRight = phoneKeyPad.get(rightHandLocation);
            int distFromLeft = getDistance(t.x, t.y, pLeft.x, pLeft.y);
            int distFromRight = getDistance(t.x, t.y, pRight.x, pRight.y);

            System.out.printf("target:%d ll:%d rl:%d dfl:%d dfr%d\n",targetNum, leftHandLocation, rightHandLocation, distFromLeft, distFromRight);

            if(distFromLeft > distFromRight){
                return 'R';
            } else if (distFromLeft < distFromRight) {
                return 'L';
            } else {
                return Character.toUpperCase(userHand.charAt(0));
            }
        }

    }

    public String solution(int[] numbers, String hand) {
        String answer = "";
        int leftHandLocation = 11;
        int rightHandLocation = 12;
        for (var num : numbers) {
            Character resHand = whichHand(hand, num, leftHandLocation, rightHandLocation);
            System.out.println(resHand);
            if (resHand == 'L') leftHandLocation = num;
            if (resHand == 'R') rightHandLocation = num;
            answer += resHand;
        }
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {

        int[] nums = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        Prog67256 prog67256 = new Prog67256();

        System.out.printf("%b\n", prog67256.solution(nums, "right").equals("LRLLLRLLRRL"));
        System.out.printf("%b\n", prog67256.solution(new int[]{7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2}, "left").equals("LRLLRRLLLRR"));

//        System.out.println(getDistance(prog67256.phoneKeyPad.get(7), prog67256.phoneKeyPad.get(0)));
//        System.out.println(getDistance(prog67256.phoneKeyPad.get(8), prog67256.phoneKeyPad.get(3)));

    }

}
