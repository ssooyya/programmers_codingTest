package CodingBasicTraining.Day21;

import java.util.*;

// 전국 대회 선발 고사
public class day21_2 {
    public static void main(String[] args) {
        int[] rank = {};
        boolean[] attendance = {};
        int answer = 0;

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 0; i < rank.length; i++) {
            map.put(rank[i], i);
        }
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) {
                al.add(rank[i]);
            }
        }
        Collections.sort(al);
        int a = map.getOrDefault(al.get(0), 0);
        int b = map.getOrDefault(al.get(1), 0);
        int c = map.getOrDefault(al.get(2), 0);

        answer = a * 10000 + b * 100 + c;
        System.out.println(answer);
    }
}
