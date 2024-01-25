package CodingBasicTraining.Day12;

import java.util.ArrayList;

// 배열 만들기 3
public class day12_3 {
    public static void main(String[] args) {
        int[] arr = {};
        int[][] intervals = {};

        int[] answer = {};
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            for (int j = intervals[i][0]; j <= intervals[i][1]; j++) {  // 첫번째 구간부터 두번째 구간까지
                al.add(arr[j]);
            }
        }
        answer = al.stream().mapToInt(x -> x).toArray();
        System.out.println(answer);
        
    }
}
