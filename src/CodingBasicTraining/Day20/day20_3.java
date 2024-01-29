package CodingBasicTraining.Day20;

import java.util.HashMap;
import java.util.Map;

// 문자열 묶기
public class day20_3 {
    public static void main(String[] args) {
        String[] strArr = {};
        int answer = 0;
        Map<Integer, Integer> groupCounts = new HashMap<>();

        for (String str :
                strArr) {
            int length = str.length();
            groupCounts.put(length, groupCounts.getOrDefault(length, 0) + 1);
        }

        for (int count :
                groupCounts.values()) {
            if (count > answer) {
                answer = count;
            }
        }
        System.out.println(answer);
    }
}
