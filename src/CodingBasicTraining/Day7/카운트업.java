package CodingBasicTraining.Day7;

import java.util.ArrayList;
import java.util.Scanner;

// 카운트 업
public class 카운트업 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start_num = sc.nextInt();
        int end_num = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = start_num; i <= end_num; i++) {
            arr.add(i);
        }
        int[] narr = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            narr[i] = arr.get(i);
        }

        System.out.println(narr);
    }
}
