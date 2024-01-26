package CodingBasicTraining.Day13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// n번째 원소부터
public class day13_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num_list = {};
        int n = sc.nextInt();

        int[] answer = new int[num_list.length - n + 1];
        for (int i = 0; i < num_list.length - n + 1; i++) {
            answer[i] = num_list[i + n -1];
        }
        System.out.println(answer);
    }
}
