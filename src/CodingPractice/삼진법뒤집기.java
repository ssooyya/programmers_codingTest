package CodingPractice;

import java.util.Scanner;

public class 삼진법뒤집기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;
        String a = Integer.toString(n, 3);
        StringBuffer sb = new StringBuffer(a);
        String reverse = sb.reverse().toString();
        answer = Integer.parseInt(reverse, 3);
        System.out.println(answer);
    }
}
