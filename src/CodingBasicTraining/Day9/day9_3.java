package CodingBasicTraining.Day9;

import java.util.Scanner;

// 문자열의 뒤의 n글자
public class day9_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String my_string = "";
        int n = sc.nextInt();
        String answer = "";

        answer = my_string.substring(my_string.length() - n);
        System.out.println(answer);
    }
}
