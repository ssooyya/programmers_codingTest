package CodingBasicTraining.Day11;

import java.util.Scanner;

// 카운트 다운
public class day11_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start_num = sc.nextInt();
        int end_num = sc.nextInt();
        int[] answer = new int[start_num - end_num + 1];

        for (int i = 0; i < answer.length; i++) {
           answer[i] = start_num--;
        }
        System.out.println(answer);
    }
}
