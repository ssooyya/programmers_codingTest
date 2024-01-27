package CodingBasicTraining.Day15;

// 원하는 문자열 찾기
public class day15_5 {
    public static void main(String[] args) {
        String myString = "";
        String pat = "";
        int answer = 0;

        if (pat.length() > myString.length()) {
            System.out.println(answer);
        }
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();
        System.out.println(myString.contains(pat) ? answer + 1 : answer);
    }
}
