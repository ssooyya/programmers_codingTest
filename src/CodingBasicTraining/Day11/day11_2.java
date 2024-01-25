package CodingBasicTraining.Day11;

import java.util.ArrayList;
import java.util.Scanner;

// 배열 만들기1
public class day11_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % k == 0) {
                arr.add(i);
            }
        }
        int[] answer = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }
        System.out.println(answer);
    }
}
