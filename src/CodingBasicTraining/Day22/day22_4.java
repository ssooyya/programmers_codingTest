package CodingBasicTraining.Day22;

import java.util.ArrayList;
import java.util.List;

// 배열의 원소 삭제하기
public class day22_4 {
    public static void main(String[] args) {
        int[] arr = {};
        int[] delete_list = {};
        List<Integer> al = new ArrayList<>();
        for (int num : arr) {
            boolean isDeleted = false;
            for (int deleteNum : delete_list) {
                if (num == deleteNum) {
                    isDeleted = true;
                    break;
                }
            }
            if (!isDeleted){
                al.add(num);
            }
        }
        int[] answer = new int[al.size()];
        for (int i = 0; i < al.size(); i++) {
            answer[i] = al.get(i);
        }
        System.out.println(answer);
    }
}
