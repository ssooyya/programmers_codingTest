package CodingBasicTraining.Day2;

import java.util.Scanner;

// 홀짝 구분하기
public class day2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n % 2 == 0){
            System.out.printf(n + " is even");
        } else {
            System.out.printf(n + " is odd");
        }
    }
}
