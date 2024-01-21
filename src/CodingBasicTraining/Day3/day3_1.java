package CodingBasicTraining.Day3;

import java.util.Scanner;

// 문자열 섞기
public class day3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        
        String answer = "";
        for (int i = 0; i < str1.length(); i++) {
            answer = answer + str1.charAt(i) + str2.charAt(i);
        }
        System.out.println(answer);
    }
}
