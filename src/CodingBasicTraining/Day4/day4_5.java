package CodingBasicTraining.Day4;

import java.util.Scanner;

// flag에 따라 다른 값 반환하기
public class day4_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean flag = sc.hasNext();
        if(flag == true){
            System.out.println(a + b);
        } else System.out.println(a - b);
    }
}
