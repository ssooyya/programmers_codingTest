package CodingBasicTraining.Day4;

import java.util.Scanner;

// 조건 문자열
public class day4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ineq = sc.next();
        String eq = sc.next();
        int n = sc.nextInt();
        int m = sc.nextInt();

        if(ineq.equals(">")){
            if (eq.equals("=")){
                System.out.println(n >= m ? 1 : 0);
            } else if (eq.equals("!")) {
                System.out.println(n > m ? 1 : 0);
            }
        } else if (ineq.equals("<")) {
            if (eq.equals("=")){
                System.out.println(n <= m ? 1 : 0);
            } else if (eq.equals("!")) {
                System.out.println(n < m ? 1 : 0);
            }
        }
        System.out.println(0);
    }
}
