package CodingBasicTraining.Day13;

import java.util.Scanner;

// n번째 원소까지
public class day13_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num_list = {};
        int n = sc.nextInt();
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            answer[i] = num_list[i];
        }
        System.out.println(answer);
    }
}
