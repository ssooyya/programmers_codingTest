package CodingBasicTraining.Day21;

import java.util.Scanner;

// 문자열을 정수로 변환하기
public class day21_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n_str = sc.next();
        int answer = 0;
        answer = Integer.parseInt(n_str);
        System.out.println(answer);
    }
}
