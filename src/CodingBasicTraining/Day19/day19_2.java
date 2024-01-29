package CodingBasicTraining.Day19;

import java.util.ArrayList;
import java.util.List;

// 배열의 원소만큼 추가하기
public class day19_2 {
    public static void main(String[] args) {
        int[] arr = {};
        List<Integer> al = new ArrayList<>();

        for (int num : arr) {
            for (int i = 0; i < num; i++) {
                al.add(num);
            }
        }
        int[] answer = new int[al.size()];
        for (int i = 0; i < al.size(); i++) {
            answer[i] = al.get(i);
        }
        System.out.println(answer);
    }
}
