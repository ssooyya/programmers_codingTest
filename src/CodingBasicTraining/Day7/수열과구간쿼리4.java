package CodingBasicTraining.Day7;

// 수열과 구간 쿼리4
public class 수열과구간쿼리4 {
    public static void main(String[] args) {
        int[] arr = {};
        int[][] queries = {};
        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];

            for (int j = s; j <= e; j++) {
                if(j % k == 0){
                    arr[j] += 1;
                }
            }
        }
        System.out.println(arr);
    }
}
