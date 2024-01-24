package CodingBasicTraining.Day10;

import java.util.Scanner;

// 문자열 뒤집기
public class day10_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String my_string = "";
        int s = sc.nextInt();
        int e = sc.nextInt();
        String answer = "";
        StringBuilder sb = new StringBuilder(my_string.substring(s, e+1));
        sb.reverse();
        answer = my_string.substring(0, s) + sb + my_string.substring(e+1, my_string.length());
        System.out.println(answer);
    }
}
