package CodingBasicTraining.Day12;

import java.util.ArrayList;
import java.util.Collections;

// 2의 영역
public class day12_4 {
    public static void main(String[] args) {
        int[] arr = {};
        int[] answer = {};
        ArrayList<Integer> idxList = new ArrayList<>();
        ArrayList<Integer> intList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                idxList.add(i);
            }
        }
        if (idxList.size() == 1) intList.add(2);
        if (idxList.size() == 0) intList.add(-1);
        if (idxList.size() > 1) {
            for (int i = Collections.min(idxList); i <=Collections.max(idxList); i++) {
                intList.add(arr[i]);
            }
        }
        answer = intList.stream().mapToInt(x -> x).toArray();
        System.out.println(answer);
    }
}
