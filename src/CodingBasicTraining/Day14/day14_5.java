package CodingBasicTraining.Day14;

// 수열과 구간 쿼리 1
public class day14_5 {
    public static void main(String[] args) {
        int[] arr = {};
        int[][] queries = {};
        int[] answer = {};

        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            for (int i = s; i <= e; i++) {
                arr[i] += 1;
            }
        }
        System.out.println(arr);
    }
}
