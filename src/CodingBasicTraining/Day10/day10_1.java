package CodingBasicTraining.Day10;

import java.util.Scanner;

// 문자열의 앞의 n글자
public class day10_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String my_string = "";
        int n = sc.nextInt();
        String answer = "";

        answer = my_string.substring(0,n);
        System.out.println(answer);
    }
}
