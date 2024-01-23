package CodingBasicTraining.Day8;

import java.util.Scanner;

// 주사위 게임3
public class day8_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int answer = 0;

        if (a == b && a == c && a == d) {
            answer = 1111 * a;
        } else if ((a == b && b == c) || (b == c && c == d) || (c == d && d == a) || (d == a && a == b))  {
            int p;
            int q;
            if (a == b && b == c) {
                p = a;
                q = d;
            } else if (b == c && c == d) {
                p = b;
                q = a;
            } else if (c == d && d == a) {
                p = c;
                q = b;
            } else {
                p = d;
                q = c;
            }
            answer = (int) Math.pow(10 * p + q, 2);
        } else if (a == b || a == c || a == d || b == c || b == d || c == d) {
            int p = 0;
            int q = 0;
            int r = 0;
            if (a == b) {
                p = a;
                q = c;
                r = d;
            } else if (a == c) {
                p = a;
                q = b;
                r = d;
            } else if (a == d) {
                p = a;
                q = b;
                r = c;
            } else if (b == c) {
                p = b;
                q = a;
                r = d;
            } else if (b == d) {
                p = b;
                q = a;
                r = c;
            } else {
                p = c;
                q = a;
                r = b;
            }
            answer = (int)(p + q) * Math.abs(p - q);
            if (q != r) {
                answer = q * r;
            }
        } else {
            int min = Math.min(Math.min(a, b), Math.min(c, d));
            answer = min;
        }
        System.out.println(answer);
    }
}
