package CodingBasicTraining.Day21;

import java.util.Scanner;

// 문자열 정수의 합
public class day21_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num_str = sc.next();
        int answer = 0;
        for (int i = 0; i < num_str.length(); i++) {
            answer += Integer.parseInt(num_str.substring(i ,i+1));
        }
        System.out.println(answer);
    }
}
