package CodingBasicTraining.Day1;

import java.util.Scanner;

// 대소문자 바꿔서 출력하기
public class day1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = "";
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (Character.isUpperCase(c)) {
                b += Character.toLowerCase(c);
            } else {
                b += Character.toUpperCase(c);
            }
        }
        System.out.println(b);
    }
}
