package CodingBasicTraining.Day12;

// 첫 번째로 나오는 음수
public class day12_2 {
    public static void main(String[] args) {
        int[] num_list = {};
        int answer = 0;
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0) {
                answer = i;
                break;
            }
            if (num_list[i] >= 0) {
                answer = -1;
            }
        }
        System.out.println(answer);
    }
}
