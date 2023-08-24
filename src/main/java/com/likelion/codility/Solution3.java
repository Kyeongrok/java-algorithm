package com.likelion.codility;



class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class Solution3 {
    public static int calculateDistance(Point p1, Point p2) {
        int dx = p2.x - p1.x;
        int dy = p2.y - p1.y;

        return (int) Math.sqrt(dx * dx + dy * dy);
    }

    public int solution(int[] A, int[] B, int X, int Y) {
        // Implement your solution here
        Point icon = new Point(X, Y);
        for (int i = 0; i < A.length; i++) {
            Point p = new Point(A[i], B[i]);
            if(calculateDistance(icon, p) <= 20){
                return i + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Point p1 = new Point(500, 500);
        Point p2 = new Point(505, 510);

        System.out.println(calculateDistance(p1, p2));
    }
}
