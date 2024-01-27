package CodingBasicTraining.Day15;

// 길이에 따른 연산
public class day15_4 {
    public static void main(String[] args) {
        int[] num_list = {};
        int answer = 0;
        if (num_list.length > 10) {
            for (int n :
                    num_list) {
                answer += n;
            }
        } else if (num_list.length <= 10) {
            answer= 1;
            for (int n :
                    num_list) {
                answer *= n;
            }
        }
        System.out.println(answer);
    }
}
