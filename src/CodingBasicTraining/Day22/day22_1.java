package CodingBasicTraining.Day22;

import java.util.Scanner;

// 0 떼기
public class day22_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n_str = sc.next();
        String answer = "";

        int i = Integer.parseInt(n_str);
        answer = i + "";
        System.out.println(answer);
    }
}
