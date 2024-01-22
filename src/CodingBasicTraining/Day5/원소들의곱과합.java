package CodingBasicTraining.Day5;

import java.util.Scanner;

// 원소들의 곱과 합
public class 원소들의곱과합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num_list = {};
        int sum = 0;
        int mul = 1;
        for (int i = 0; i < num_list.length; i++) {
            sum += num_list[i];
            sum = (int) Math.pow(sum, 2);
            mul *= num_list[i];
            if (sum > mul) {
                System.out.println(1);
            } else System.out.println(0);
        }
    }
}
