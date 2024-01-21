package CodingBasicTraining.Day3;

import java.util.Scanner;

public class day3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String ab = String.valueOf(a) + String.valueOf(b);

        if (Integer.valueOf(ab) >= 2 * a * b) {
            System.out.println(ab);
        } else {
            System.out.println(2 * a * b);
        }
    }
}
