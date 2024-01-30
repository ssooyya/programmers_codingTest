package CodingBasicTraining.Day22;

import java.math.BigInteger;
import java.util.Scanner;

// 두 수의 합
public class day22_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String answer = "";
        BigInteger Ba = new BigInteger(a);
        BigInteger Bb = new BigInteger(b);
        BigInteger sum = Ba.add(Bb);
        answer = sum + "";
        System.out.println(answer);
    }
}
