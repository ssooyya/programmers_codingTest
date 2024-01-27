package CodingBasicTraining.Day15;

// 조건에 맞게 수열 변환하기 2
public class day15_2 {
    public static void main(String[] args) {
        int[] arr = {};
        int answer = -1;
        int loopCnt = 0;
        while (answer == -1){
            int changeCnt = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                    changeCnt++;
                } else if (arr[i]< 50 && arr[i]% 2 !=0) {
                    arr[i]= (arr[i]* 2) + 1;
                    changeCnt++;
                }
            }
            loopCnt++;
            if (changeCnt == 0) {
                answer= loopCnt;
            }
        }
        System.out.println(answer - 1);
    }
}
