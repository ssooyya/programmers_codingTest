package CodingPractice;

import java.util.Scanner;

public class 음양더하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 배열 길이 입력
        int n = sc.nextInt();

        int[] absolutes = new int[n];
        boolean[] signs = new boolean[n];

        // absolutes 값 입력
        for (int i = 0; i < n; i++) {
            absolutes[i] = sc.nextInt();
        }

        // signs 값 입력 (true / false)
        for (int i = 0; i < n; i++) {
            signs[i] = sc.nextBoolean();
        }
        int answer = 0;
        for (int i = 0; i < n; i++) {
            if (signs[i]) {
                answer += absolutes[i];
            } else {
                answer -= absolutes[i];
            }
        }

        System.out.println(answer);
    }

}
