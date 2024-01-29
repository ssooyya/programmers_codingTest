package CodingBasicTraining.Day19;

import java.util.ArrayList;
import java.util.List;

// 빈 배열에 추가, 삭제하기
public class day19_3 {
    public static void main(String[] args) {
        int[] arr = {};
        boolean[] flag = {};
        List<Integer> x = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (flag[i]) {
                int num = arr[i];
                for (int j = 0; j < num * 2; j++) {
                    x.add(arr[i]);
                }
            } else {
                if (x.size() >= arr[i]) {
                    int num = arr[i];
                    int size = x.size();
                    for (int j = 0; j < num; j++) {
                        x.remove(size - 1 - j);
                    }
                }
            }
        }
        int[] answer = new int[x.size()];
        for (int i = 0; i < x.size(); i++) {
            answer[i] = x.get(i);
        }
        System.out.println(answer);
    }
}
