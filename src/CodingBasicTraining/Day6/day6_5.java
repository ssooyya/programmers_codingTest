package CodingBasicTraining.Day6;

// 수열과 구간 쿼리2
public class day6_5 {
    public static void main(String[] args) {
        int[] arr = {};
        int[][] queries = {};
        int[] answer = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            int min = Integer.MAX_VALUE;
            for (int j = s; j <= e ; j++) {
                if(arr[j] > k && arr[j] < min){
                    min = arr[j];
                }
            }
            answer[i] = min == Integer.MAX_VALUE ? -1 : min;
        }
        System.out.println(answer);
    }
}
