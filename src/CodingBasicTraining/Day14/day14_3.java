package CodingBasicTraining.Day14;

import java.util.ArrayList;
import java.util.List;

// 할 일 목록
public class day14_3 {
    public static void main(String[] args) {
        String[] todo_list = {};
        boolean[] finished = {};
        List<String> al = new ArrayList<>();

        for (int i = 0; i < finished.length; i++) {
            if (!finished[i]) {
                al.add(todo_list[i]);
            }
        }
        String[] answer = new String[al.size()];
        answer = al.toArray(answer);

        System.out.println(answer);
    }
}