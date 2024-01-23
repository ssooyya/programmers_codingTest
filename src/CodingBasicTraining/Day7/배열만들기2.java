package CodingBasicTraining.Day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// 배열 만들기2 ★★★
public class 배열만들기2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        ArrayList<Integer> resultList = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            if (String.valueOf(i).matches("[05]+")) {   // 0과 5 매치
                resultList.add(i);
            }
        }
        if (resultList.isEmpty()) {                         // 그러한 정수가 없다면 -1이 담긴 배열
            System.out.println(new int[]{-1});
        }

        int[] resultArray = new int[resultList.size()]; // 오름차순
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }
        System.out.println(resultArray);
    }
}
