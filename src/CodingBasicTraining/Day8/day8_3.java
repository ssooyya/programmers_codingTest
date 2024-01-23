package CodingBasicTraining.Day8;

import java.util.Scanner;

// 글자 이어 붙여 문자열 만들기
public class day8_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String my_string = sc.next();
        int[] index_list = {};
        String answer = "";
        for (int i = 0; i < index_list.length; i++) {
            answer += my_string.charAt(index_list[i]);
        }
        System.out.println(answer);
    }
}
