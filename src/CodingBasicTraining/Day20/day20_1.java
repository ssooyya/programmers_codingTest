package CodingBasicTraining.Day20;

import java.util.Arrays;

// 배열의 길이를 2의 거듭제곱으로 만들기
public class day20_1 {
    public static void main(String[] args) {
        int[] arr = {};
//        int n = arr.length;
//        int targetLength = 1;
//        while(targetLength < n){
//            targetLength *= 2;
//        }
//        int[] answer = new int[targetLength];
//        Arrays.fill(answer, 0);
//        System.arraycopy(arr, 0, answer, 0, n);
//        System.out.println(answer);

        int length = arr.length;

        while (length % 2 == 0) {
            length = length / 2;
        }
        if (length == 1) {
            System.out.println(arr);
        }

        int x = 0;
        int y = 0;
        int len = arr.length;

        while (len > x) {
            x = (int) Math.pow(2, y++);
        }

        int[] answer = new int[x];
        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }
        System.out.println(answer);
    }
}
