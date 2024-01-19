package CodingBasicTraining.Day2;

import java.util.Scanner;

// 문자열 겹쳐쓰기
public class day2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String my_string = sc.next();
        String overwrite_string = sc.next();
        int s = sc.nextInt();
        String answer = "";
        int len1 = my_string.length();
        int len2 = overwrite_string.length();
        String sub1 = my_string.substring(0, s);
        String sub2 = my_string.substring((len2 + s), len1);

        answer += sub1 + overwrite_string + sub2;
        System.out.println(answer);
    }
}
