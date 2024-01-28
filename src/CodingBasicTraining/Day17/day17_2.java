package CodingBasicTraining.Day17;

// 문자열이 몇 번 등장하는지 세기
public class day17_2 {
    public static void main(String[] args) {
        String myString = "";
        String pat = "";
        int answer = 0;
        for (int i = myString.length() - 1; i >= 0; i--) {
            String sub = myString.substring(0, i + 1);
            if (sub.endsWith(pat)) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}
