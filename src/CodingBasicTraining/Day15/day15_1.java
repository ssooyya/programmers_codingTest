package CodingBasicTraining.Day15;

// 조건에 맞게 수열 변환하기1
public class day15_1 {
    public static void main(String[] args) {
        int[] arr = {};
        int[] answer = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 50 && arr[i] % 2 ==0) {
                answer[i] = arr[i] / 2;
            } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                answer[i] = arr[i] * 2;
            }else{
                answer[i] = arr[i];
            }
        }
        System.out.println(answer);
    }
}
