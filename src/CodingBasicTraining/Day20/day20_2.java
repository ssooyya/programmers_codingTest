package CodingBasicTraining.Day20;

// 배열 비교하기
public class day20_2 {
    public static void main(String[] args) {
        int[] arr1 = {};
        int[] arr2 = {};
        int answer = 0;
        int sum1 = 0;
        int sum2 = 0;

        for (int num : arr1) {
            sum1 += num;
        }
        for (int num : arr2) {
            sum2 += num;
        }

        if (arr1.length > arr2.length || (arr1.length == arr2.length && sum1 > sum2)) {
            answer = 1;
        } else if (arr1.length < arr2.length || (arr1.length == arr2.length && sum1 < sum2)) {
            answer = -1;
        } else {
            answer = 0;
        }
        System.out.println(answer);
    }
}
