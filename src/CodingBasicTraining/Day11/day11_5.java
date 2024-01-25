package CodingBasicTraining.Day11;

import java.util.Scanner;

// 가까운 1 찾기
public class day11_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {};
        int idx = sc.nextInt();
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i >= idx && arr[i] == 1) {
                answer = i;
                break;          // 조건 만족시 탈출
            } else answer = -1;
        }
        System.out.println(answer);
    }
}
