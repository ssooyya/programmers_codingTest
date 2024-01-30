package CodingBasicTraining.Day21;

import java.util.Arrays;

// 뒤에서 5등 위로
public class day21_1 {
    public static void main(String[] args) {
        int[] num_list = {};
        int[] answer = new int[num_list.length - 5];
        Arrays.sort(num_list);
        for (int i = 5; i < num_list.length; i++) {
            answer[i - 5] = num_list[i];
        }
        System.out.println(answer);
    }
}
