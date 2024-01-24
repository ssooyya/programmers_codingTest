package CodingBasicTraining.Day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// qr code
public class day10_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int r = sc.nextInt();
        String code = "";
        String answer = "";

        for (int i = 0; i < code.length(); i++) {
            if(i % q == r){
                answer += code.charAt(i);
            }
        }
        System.out.println(answer);
    }

}
