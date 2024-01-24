package CodingBasicTraining.Day9;

// 부분 문자열 이어 붙여 문자열 만들기
public class day9_2 {
    public static void main(String[] args) {
        String[] my_strings = {};
        int[][] parts = {};
        String answer = "";
        for (int i = 0; i < my_strings.length; i++) {
            int s = parts[i][0];
            int e = parts[i][1];

            String str = my_strings[i];
            answer += str.substring(s, e+1);
        }
        System.out.println(answer);
    }
}
