package CodingBasicTraining.Day6;

import java.util.Scanner;

// 수 조작하기1
public class day6_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String control = sc.next();
        int answer = n;

        for (int i = 0; i <control.length(); i++) {
            if (control.charAt(i) == 'w') {
                answer = answer + 1;
            } else if (control.charAt(i) == 's') {
                answer = answer - 1;
            } else if (control.charAt(i) == 'd') {
                answer = answer + 10;
            } else if (control.charAt(i) == 'a') {
                answer = answer - 10;
            }
        }

        System.out.println(answer);
    }
}
