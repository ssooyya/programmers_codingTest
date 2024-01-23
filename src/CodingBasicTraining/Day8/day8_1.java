package CodingBasicTraining.Day8;

import java.util.Scanner;

// 간단한 논리 연산
public class day8_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean x1 = sc.hasNext();
        boolean x2 = sc.hasNext();
        boolean x3 = sc.hasNext();
        boolean x4 = sc.hasNext();
        boolean answer = (x1 || x2) && (x3 || x4);
        System.out.println(answer);
    }
}
