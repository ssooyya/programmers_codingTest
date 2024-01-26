package CodingBasicTraining.Day13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// n개 간격의 원소들
public class day13_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num_list = {};
        int n = sc.nextInt();

        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < num_list.length; i+=n) {
            answer.add(num_list[i]);
        }
        System.out.println(answer);
    }
}
