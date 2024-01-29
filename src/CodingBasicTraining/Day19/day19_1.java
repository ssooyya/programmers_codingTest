package CodingBasicTraining.Day19;

import java.util.ArrayList;
import java.util.List;

// 세 개의 구분자
public class day19_1 {
    public static void main(String[] args) {
        String myStr = "";
        List<String> answer = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (char c : myStr.toCharArray()) {
            if (c == 'a' || c =='b' || c == 'c') {
                if (sb.length() > 0) {
                    answer.add(sb.toString());
                    sb = new StringBuilder();
                }
            } else {
                sb.append(c);
            }
        }
        if (sb.length() > 0) {
            answer.add(sb.toString());
        }
        if (answer.isEmpty()){
            System.out.println(new String[] {"EMPTY"});
        } else {
            System.out.println(answer.toArray(new String[0]));
        }
    }
}
