package CodingBasicTraining.Day6;

// 마지막 두 원소
public class 마지막두원소 {
    public static void main(String[] args) {
        int[] num_list = {};
        int[] answer = new int[(num_list.length) + 1];
        for(int i = 0; i < num_list.length; i++){
            answer[i] = num_list[i];
        }
        int last = num_list[(num_list.length) - 1] > num_list[(num_list.length) - 2] ?
                num_list[(num_list.length) - 1] - num_list[(num_list.length) - 2]
                : num_list[(num_list.length) - 1] * 2;
        answer[num_list.length] = last;
        System.out.println(answer);
    }
}
