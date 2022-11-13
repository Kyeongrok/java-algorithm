package com.likelion.sort.radix;

public class NumberOfDigit {
    public int maxDigits(int[] arr) {
        int maxDigit = 0;
        for (int i = 0; i < arr.length; i++) {
            int digits = (int) (Math.log10(arr[i]) + 1);
            if(maxDigit < digits) maxDigit = digits;
        }
        return maxDigit;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{2, 8, 18, 13, 1, 7, 16, 7, 0, 14};
        NumberOfDigit numberOfDigit = new NumberOfDigit();
        int maxDigit = numberOfDigit.maxDigits(arr);
        System.out.println(maxDigit);
    };
}
