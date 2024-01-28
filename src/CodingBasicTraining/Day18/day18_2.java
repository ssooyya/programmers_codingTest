package CodingBasicTraining.Day18;

import java.util.Arrays;

// 문자열 잘라서 정렬하기
public class day18_2 {
    public static void main(String[] args) {
        String myString = "";
        String[] mysplit = myString.split("x");
        String[] answer = Arrays.stream(mysplit)
                .filter(str -> !str.isEmpty())
                .sorted()
                .toArray(String[]::new);
        System.out.println(answer);
    }
}
