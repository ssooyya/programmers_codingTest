package CodingBasicTraining.Day8;

import java.util.Scanner;

// 9로 나눈 나머지
public class day8_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int answer = 0;
        String number = "";
        int sum = 0;
        String[] arr = number.split("");

        for (int i = 0; i < arr.length; i++) {
            sum += Integer.parseInt(arr[i]);
        }
        answer = sum % 9;
        System.out.println(answer);
    }

}
