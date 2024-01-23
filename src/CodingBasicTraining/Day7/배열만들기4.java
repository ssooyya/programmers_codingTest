package CodingBasicTraining.Day7;

import java.util.ArrayList;
import java.util.Scanner;

// 배열 만들기4 ★
public class 배열만들기4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> temp = new ArrayList<>();
        int[] arr = {};
        
        int i = 0;
        while (i < arr.length){
            if (temp.size() == 0) {
                temp.add(arr[i]);
                i += 1;
            } else  {
                int last = temp.get((temp.size()) -1);
                if (temp.size() != 0 && last < arr[i]) {
                    temp.add(arr[i]);
                    i += 1;
                } else if (temp.size() != 0 && last >= arr[i]) {
                    temp.remove((temp.size()) - 1);
                }
            }
        }
        int[] stk = new int[temp.size()];
        for (int j = 0; j < temp.size(); j++) {
            stk[j] = temp.get(j);
        }
        System.out.println(stk);
    }
}
