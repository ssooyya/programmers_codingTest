package CodingBasicTraining.Day3;

import java.util.Scanner;

// 문자열 곱하기
public class day3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String my_string = sc.next();
        int k = sc.nextInt();
        String answer = "";
        for (int i = 0; i < k; i++) {
            answer += my_string;
        }
        System.out.println(answer);

    }
}