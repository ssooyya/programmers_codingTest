package CodingBasicTraining.Day12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 리스트 자르기
public class day12_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] slicer ={};
        int[] num_list = {};
        List<Integer> arr = new ArrayList<>();

        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];

        if (n == 1) {
            for (int i = 0; i < b + 1; i++) {
                arr.add(num_list[i]);
            }
        } else if (n == 2) {
            for (int i = a; i < num_list.length; i++) {
                arr.add(num_list[i]);
            }
        } else if (n == 3) {
            for (int i = a; i < b + 1; i++) {
                arr.add(num_list[i]);
            }
        } else if (n == 4) {
            for (int i = a; i < b + 1; i+=c) {
                arr.add(num_list[i]);
            }
        }
        int[] answer = arr.stream().mapToInt(x -> x).toArray();
        System.out.println(answer);
    }
}
