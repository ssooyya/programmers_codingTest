package CodingBasicTraining.Day5;

import java.util.Scanner;

// 등차수열의 특정한 항만 더하기
public class 등차수열의특정한항만더하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int d = sc.nextInt();
        boolean[] included = {};
        int sum = 0;

        for (int i = 1; i <= included.length; i++) {
            if (included[i-1] == true) {
                sum += (a + (i - 1) * d);
            }
        }
        System.out.println(sum);
    }
}
