package CodingBasicTraining.Day22;

import java.util.Scanner;

// 부분 문자열인지 확인하기
public class day22_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String my_string = sc.next();
        String target = sc.next();

        int answer = 0;
        if (my_string.contains(target)) {
            answer = answer + 1;
        } else {
            answer = 0;
        }
        System.out.println(answer);
    }
}
