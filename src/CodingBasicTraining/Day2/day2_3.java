package CodingBasicTraining.Day2;

import java.util.Scanner;

// 문자열 돌리기
public class day2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            System.out.println(c);
        }
    }
}
