package CodingBasicTraining.Day13;

import java.util.Scanner;

// 순서 바꾸기
public class day13_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num_list = {};
        int n = sc.nextInt();

        int idx = 0;
        int[] answer = new int[num_list.length];
        for (int i = n; i < num_list.length; i++) {
            answer[idx++] = num_list[i];
        }
        for (int i = 0; i < n; i++) {
            answer[idx++] = num_list[i];
        }
        System.out.println(answer);
    }
}
