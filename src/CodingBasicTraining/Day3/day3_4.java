package CodingBasicTraining.Day3;

import java.util.Scanner;

// 더 크게 합치기
public class day3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String ab = String.valueOf(a) + String.valueOf(b);
        String ba = String.valueOf(b) + String.valueOf(a);
        if(Integer.parseInt(ab) >= Integer.parseInt(ba)){
            System.out.println(Integer.parseInt(ab));
        } else {
            System.out.println(Integer.parseInt(ba));
        }
    }
}
