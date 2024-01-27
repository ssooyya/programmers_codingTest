package CodingBasicTraining.Day15;

// 1로 만들기
public class day15_3 {
    public static void main(String[] args) {
        int[] num_list = {};
        int cnt = 0;
        for (int n : num_list) {
            while (n != 1) {
                if (n % 2 == 0) {
                    n /= 2;
                    cnt++;
                } else if (n % 2 != 0) {
                    n = (n - 1) / 2;
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
