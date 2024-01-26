package CodingBasicTraining.Day14;

import java.util.ArrayList;
import java.util.List;

// 5명씩
public class day14_2 {
    public static void main(String[] args) {
        String[] names = {};
        List<String> answer = new ArrayList<>();
        for (int i = 0; i < names.length; i+=5) {
            answer.add(names[i]);
        }
        System.out.println(answer);
    }
}
