package CodingBasicTraining.Day9;

import java.util.Arrays;

// 접미사 배열
public class day9_4 {
    public static void main(String[] args) {
        String my_string = "";
        String[] answer = new String[my_string.length()];

        for (int i = 0; i < my_string.length(); i++) {
            answer[i] = my_string.substring(i);
        }
        Arrays.sort(answer);
        System.out.println(answer);
    }
}
