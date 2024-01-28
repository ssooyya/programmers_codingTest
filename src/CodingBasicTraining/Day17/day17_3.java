package CodingBasicTraining.Day17;

import java.util.ArrayList;
import java.util.List;

// ad 제거하기
public class day17_3 {
    public static void main(String[] args) {
        String[] strArr = {};
        List<String> answer = new ArrayList<>();
        for (String str :
                strArr) {
            if (!str.contains("ad")) {
                answer.add(str);
            }
        }
        System.out.println(answer.toArray(new String[0]));
    }
}
