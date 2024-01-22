package CodingBasicTraining.Day5;

public class day5_5 {
    public static void main(String[] args) {
        int[] num_list = {};
        int answer = 0;
        String a = "";
        String b = "";
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 1) {   // 홀수
                a += String.valueOf(num_list[i]);
            } else b += String.valueOf(num_list[i]);
        }
        answer = Integer.parseInt(a) + Integer.parseInt(b);
        System.out.println(answer);
    }
}
