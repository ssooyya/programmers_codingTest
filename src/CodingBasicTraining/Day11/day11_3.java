package CodingBasicTraining.Day11;

// 글자 지우기
public class day11_3 {
    public static void main(String[] args) {
        String my_string = "";
        int[] indices = {};
        String answer = "";
        String[] temp = my_string.split("");    // 문자열을 배열로
        for (int i = 0; i < indices.length; i++) {  //
            temp[indices[i]] = "";
        }
        for (String x : temp) { //문자열 이어붙이기
            answer += x;
        }
        System.out.println(answer);
    }
}
