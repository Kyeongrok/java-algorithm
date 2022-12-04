package com.likelion;

public class CntOfPAndY {
    boolean solution(String s) {
        int cntP = 0;
        int cntY = 0;
        for (int i = 0; i < s.length(); i++) {
            if ('P' == Character.toUpperCase(s.charAt(i))) {
                cntP++;
            } else if ('Y' == Character.toUpperCase(s.charAt(i))) {
                cntY++;
            }
        }
        return cntP == cntY;
    }
    public static void main(String[] args) {
        CntOfPAndY cntOfPAndY = new CntOfPAndY();
        System.out.println(cntOfPAndY.solution("pPoooyY"));
        System.out.println(cntOfPAndY.solution("Pyy"));
    }

}
