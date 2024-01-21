package CodingBasicTraining.Day4;

import java.util.Scanner;

// n의 배수
public class day4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = sc.nextInt();

        if(num % n == 0){
            System.out.println(1);
        } else System.out.println(0);

    }
}
