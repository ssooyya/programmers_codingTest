package CodingBasicTraining.Day3;

import java.util.Scanner;

// 문자 리스트를 문자열로 변환하기
public class day3_2 {
    public String solution(String[] arr) {
        String answer = "";
        for(int i=0; i< arr.length; i++){
            answer += arr[i];
        }
        return answer;
    }
}
