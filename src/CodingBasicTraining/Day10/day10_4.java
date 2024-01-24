package CodingBasicTraining.Day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 세로 읽기
public class day10_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String my_string = "";
        int m = sc.nextInt();
        int c = sc.nextInt();
        String answer = "";
        List<String> result = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i+=m) {
            String sub = my_string.substring(i, i+m);
            result.add(sub);
        }
        for (String str : result) {
            answer += str.substring(c-1, c);
        }
        System.out.println(answer);
    }
}
