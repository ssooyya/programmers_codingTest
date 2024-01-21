package CodingBasicTraining.Day4;

import java.util.Scanner;

// 공배수
public class day4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();

        if(number % n == 0 && number % m == 0){
            System.out.println(1);
        } else System.out.println(0);
    }
}
