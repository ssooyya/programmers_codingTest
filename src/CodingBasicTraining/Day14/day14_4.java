package CodingBasicTraining.Day14;

import java.util.Scanner;

// n보다 커질 때까지 더하기
public class day14_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {};
        int n = sc.nextInt();
        int answer = 0;
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            if (sum >= n) {
                answer = sum;
                break;
            }
        }

        System.out.println(answer);
    }
}
