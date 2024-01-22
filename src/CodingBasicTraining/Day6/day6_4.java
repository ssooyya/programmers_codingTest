package CodingBasicTraining.Day6;

// 수열과 구간 쿼리3
public class day6_4 {
    public static void main(String[] args) {
        int[] arr = {};
        int[][] queries = {};
        int n = 0;
        for (int i = 0; i < queries.length; i++) {
            n = arr[queries[i][0]];
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = n;
        }
        System.out.println(arr);
    }
}
