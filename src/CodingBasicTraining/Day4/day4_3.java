package CodingBasicTraining.Day4;

import java.util.Scanner;

// 홀짝에 따라 다른 값 변환하기
public class day4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        if(n % 2 == 1){
            for (int i = 1; i <= n; i+=2) {
               sum += i;
            }
            System.out.println(sum);
        } else {
            for (int i = 2; i <= n; i+=2) {
                sum += i * i;
            }
            System.out.println(sum);
        }
    }
}
