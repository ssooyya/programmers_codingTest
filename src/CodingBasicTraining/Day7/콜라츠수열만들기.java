package CodingBasicTraining.Day7;

import java.util.ArrayList;
import java.util.Scanner;

// 콜라츠 수열 만들기
public class 콜라츠수열만들기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(n);  // 첫 수 (입력값)
        while (n != 1){ // n이 1이 아닐때
            if (n % 2 == 0) {   // 짝수
                n = n / 2;
                answer.add(n);
            } else {
                n = 3 * n + 1;
                answer.add(n);
            }
        }
        int[] ranswer = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            ranswer[i] = answer.get(i);
        }
        System.out.println(ranswer);
    }
}
