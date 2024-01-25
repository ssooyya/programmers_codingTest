package CodingBasicTraining.Day11;

// 문자 개수 세기
public class day11_1 {
    public static void main(String[] args) {
        String my_string = "";
        int[] answer = new int[52];
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                answer[c - 'A']++;
            } else if (c >= 'a' && c <= 'z') {
                answer[26 + c - 'a']++;
            }
        }
        System.out.println(answer);
    }
}
