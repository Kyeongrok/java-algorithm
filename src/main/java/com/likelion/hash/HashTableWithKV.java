package com.likelion.hash;

import java.util.ArrayList;
import java.util.List;

class Node {
    String key;
    Integer value;

    public Node(String key, Integer value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public Integer getValue() {
        return value;
    }
}
public class HashTableWithKV {

    private int size = 10000;
    private List<Node>[] table = new ArrayList[size];

    public HashTableWithKV() {
    }

    public HashTableWithKV(int size) {
        this.size = size;
        this.table = new ArrayList[size];
    }

    public int hash(String key) {
        int asciiSum = 0;
        for (int i = 0; i < key.length(); i++) {
            asciiSum += key.charAt(i);
        }
        return asciiSum % size;
    }

    public void insert(String key, Integer value) {
        int hashCode = hash(key);
        if (this.table[hashCode] == null) {
            this.table[hashCode] = new ArrayList<>();
        }
        // 넣을 때 중복 Check를 할 수 있다.
        this.table[hashCode].add(new Node(key, value));
        System.out.println(key + " " + hashCode + "방에 저장이 완료 되었습니다.");
    }

    public Integer search(String key) {
        int hashIdx = hash(key);
        List<Node> selectedCell = this.table[hashIdx];
        for (Node node :selectedCell) {
            if (key.equals(node.getKey())) {
                return node.getValue();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        String[] names = new String[]{"DongyeonKang",
                "SubinKang", "KwanwunKo", "HyunseokKo", "KyoungdukKoo", "YeonjiGu", "SoyeonKown", "OhsukKwon", "GunwooKim", "KiheonKim", "NayeongKim", "DohyeonKim", "MinkyoungKim", "MinjiKim", "SanghoKim", "SolbaeKim", "YejinKim", "EungjunKim", "JaegeunKim", "JeonghyeonKim", "JunhoKim", "JisuKim", "kimjinah", "HaneulKim", "HeejungKim", "KimoonPark", "EunbinPark", "JeongHoonPark", "JeminPark", "TaegeunPark", "JiwonBae", "SeunggeunBaek", "JihwanByeon", "HeungseopByeon", "JeongHeeSeo", "TaegeonSeo", "SeeYunSeok", "SuyeonSeong", "SeyoelSon", "MinjiSong", "JinwooSong", "hyunboSim", "SominAhn", "JiyoungAhn", "ChangbumAn", "SoonminEom",
                "HyeongsangOh", "SuinWoo", "JuwanWoo", "InkyuYoon", "GahyunLee", "DaonLee", "DohyunLee", "SanghunLee", "SujinLee", "AjinLee", "YeonJae", "HyeonjuLee", "HakjunYim", "SeoyunJang", "SeohyeonJang", "JinseonJang", "SujinJeon", "SeunghwanJeon", "DaehwanJung", "JaeHyunJeung", "HeejunJeong", "GukhyeonCho", "MunjuJo", "YejiJo", "ChanminJu", "MinjunChoi", "SujeongChoi", "SeunghoChoi", "AyeongChoi", "GeonjooHan", "JinhyuckHeo", "MinwooHwang", "SieunHwang",
                "JunhaHwang"};

        HashTableWithKV ht = new HashTableWithKV(200);
        for (int i = 0; i < names.length; i++) {
            ht.insert(names[i], ht.hash(names[i]));
        }
        System.out.println(ht.search("DongyeonKang"));
        System.out.println(ht.search("JiyoungAhn"));
    }
}
