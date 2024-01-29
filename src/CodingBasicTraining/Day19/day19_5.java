package CodingBasicTraining.Day19;

import java.util.*;

// 무작위로 K개의 수 뽑기
public class day19_5 {
    private static final int NOT_FOUND= -1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {};
        int k = sc.nextInt();
        int[] answer = new int[k];
        List<Integer> al = new ArrayList<>();
        Arrays.fill(answer, NOT_FOUND);
        Set<Integer> used = new HashSet<>();
        int index = 0;
        for (int num : arr) {
            if (!used.contains(num)) {
                answer[index++] = num;
                used.add(num);
            }
            if (index >= k) {
                break;
            }
        }
        System.out.println(answer);
    }
}
