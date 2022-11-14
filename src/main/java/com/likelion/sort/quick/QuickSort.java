package com.likelion.sort.quick;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {
    public List<Integer> merge(List<Integer> left, List<Integer> pivot, List<Integer> right) {
        left.addAll(pivot);
        left.addAll(right);
        return left;
    }

    public List<Integer> sort(List<Integer> al) {
        if(al.size() <= 1) return al;

        int pivot = al.get(al.size() / 2);
        List<Integer> mid = new ArrayList<>();
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for (Integer item : al) {
            if(item < pivot) left.add(item);
            if(item > pivot) right.add(item);
            if(item == pivot) mid.add(item);
        }
        return merge(sort(left), mid, sort(right));
    }
    public static void main(String[] args) {
        int[] arr = {20, 18, 5, 19, 40, 50, 5, 25};
        QuickSort qs = new QuickSort();
        List<Integer> al = new ArrayList<>();
        for(int i: arr) al.add(i);
        List<Integer> ll = qs.sort(al);
        System.out.println(ll);
    }
}
