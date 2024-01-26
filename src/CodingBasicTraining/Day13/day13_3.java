package CodingBasicTraining.Day13;

import java.util.Arrays;

// 왼쪽 오른쪽
public class day13_3 {
    public static void main(String[] args) {
        String[] str_list = {};
        String[] answer = {};
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                System.out.println(Arrays.copyOfRange(str_list, 0, i));
            } else if (str_list[i].equals("r")){
                System.out.println(Arrays.copyOfRange(str_list, i+1, str_list.length));
            }
        }
        System.out.println(answer);
    }
}
// copyOfRange(