package CodingBasicTraining.Day9;

import java.util.ArrayList;
import java.util.Scanner;

// 배열 만들기5
public class day9_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] intStrs = {};
        int k = sc.nextInt();
        int s = sc.nextInt();
        int l = sc.nextInt();

        ArrayList<Integer> intList = new ArrayList<>();

        for (String str : intStrs) {
            int num = Integer.parseInt(str.substring(s, s + l));
            if (num > k) {
                intList.add(num);
            }

//            StringBuilder sb = new StringBuilder();
//            for (int i = s; i < s + l; i++) {
//                sb.append(str.charAt(i));
//                str = sb.toString();
//                int num = Integer.parseInt(str);
//                if (num > k) {
//                    intList.add(num);
//                }
//            }
        }
        int[] answer = intList.stream().mapToInt(x->x).toArray();

        System.out.println(answer);

    }
}
