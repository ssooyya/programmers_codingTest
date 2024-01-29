package CodingBasicTraining.Day20;

import java.util.Arrays;

// 뒤에서 5등까지
public class day20_5 {
    public static void main(String[] args) {
        int[] num_list = {};
        int[] answer = new int[5];
        Arrays.sort(num_list);
        for (int i = 0; i < 5; i++) {
            answer[i] = num_list[i];
        }
        System.out.println(answer);
    }
}
