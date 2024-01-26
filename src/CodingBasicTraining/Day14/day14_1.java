package CodingBasicTraining.Day14;

// 홀수 vs 짝수
public class day14_1 {
    public static void main(String[] args) {
        int[] num_list = {};
        int even = 0;
        int odd= 0;
        for (int i = 0; i < num_list.length; i++) {
            if (i % 2 == 0) {   // 짝수일때
                even += num_list[i];
            } else {
                odd += num_list[i];
            }
        }
        if (even >= odd){
            System.out.println(even);
        } else if (even < odd) {
            System.out.println(odd);
        }
    }
}
