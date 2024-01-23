package CodingBasicTraining.Day8;

import java.util.Scanner;

// 문자열 여러 번 뒤집기
public class day8_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String my_string = sc.next();
        int[][] queries = {};
        StringBuilder str = new StringBuilder(my_string);
        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            StringBuilder st = new StringBuilder(str.substring(s, e+1));
            st.reverse();
            str.replace(s, e+1, st.toString());
        }
        System.out.println(str);
    }
}
