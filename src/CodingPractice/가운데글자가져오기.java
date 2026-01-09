package CodingPractice;

public class 가운데글자가져오기 {
    public String solution(String s) {
        String answer = "";
        int length = s.length();
        if(length % 2 == 0){
            answer = s.substring(length / 2 - 1,length / 2 + 1);
        } else {
            answer = s.substring(length / 2, length / 2 + 1);
        }

        return answer;
    }
}
// substring(int start, int end): start 위치부터 end 전까지 문자열 반환
