package CodingBasicTraining.Day5;

import java.util.Scanner;

// 주사위 게임2
public class 주사위게임2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int answer = 0;

        if(a == b && b == c && a == c){
            answer = (int)((a + b + c) * (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)) * (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3)));
        } else if(a != b && b != c && a != c){
            answer = (a + b + c);
        } else if((a == b && a == c && b != c) || (a == c && b == c || a != b) || (a == b && b == c || a != c)){
            answer =  (int)((a + b + c) * (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)));
        }
        System.out.println(answer);
    }
}
