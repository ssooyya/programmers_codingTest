package CodingBasicTraining.Day17;

// 특정 문자열로 끝나는 가장 긴 부분 문자열 찾기
public class day17_1 {
    public static void main(String[] args) {
        String myString = "";
        String pat = "";
        String answer = "";
        int patLength = pat.length();
        int myStringLength = myString.length();

        for (int i = myStringLength - 1; i >= 0; i--) {
            String sub = myString.substring(0, i + 1);
            if (sub.endsWith(pat)) {
                answer = sub;
                break;
            }
        }
        System.out.println(answer);
    }
}
