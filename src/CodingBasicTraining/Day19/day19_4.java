package CodingBasicTraining.Day19;

import java.util.ArrayList;
import java.util.List;

// 배열 만들기 6
public class day19_4 {
    public static void main(String[] args) {
        int[] arr = {};
        List<Integer> stk = new ArrayList<>();
        int i = 0;
        while(i < arr.length){
            if (stk.isEmpty()) {
                stk.add(arr[i]);
                i++;
            } else if (stk.get(stk.size() - 1) == arr[i]) {
                stk.remove(stk.size() - 1);
                i++;
            } else if (stk.get(stk.size() - 1) != arr[i]) {
                stk.add(arr[i]);
                i++;
            }
        }
        int[] answer = new int[stk.size()];
        if (stk.isEmpty()) {
            System.out.println(new int[]{-1});
        }
        for (int j = 0; j < stk.size(); j++) {
            answer[j] = stk.get(j);
        }
        System.out.println(answer);
    }
}
