package CodingBasicTraining.Day18;

// 문자열 바꿔서 찾기
public class day18_4 {
    public static void main(String[] args) {
        String myString = "";
        String pat = "";
        int answer = 0;

        String repStr = myString.replace('A','X').replace('B', 'A').replace('X', 'B');
        if (repStr.contains(pat)) {
            answer = 1;
        }
        System.out.println(answer);
    }
}
