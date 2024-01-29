package CodingBasicTraining.Day20;

import java.util.Scanner;

// 배열의 길이에 따라 다른 연산하기
public class day20_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {};
        int n = sc.nextInt();
        int[] answer = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr.length % 2 == 0 && i % 2 == 1) {    // 길이가 짝수, 홀수 인덱스
                 answer[i] = arr[i] + n;
            } else if (arr.length % 2 == 1 && i % 2 == 0) { // 길이가 홀수, 짝수 인덱스
                answer[i] = arr[i] + n;
            } else {
                answer[i] = arr[i];
            }
        }
        System.out.println(answer);
    }
}
