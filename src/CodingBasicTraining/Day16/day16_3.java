package CodingBasicTraining.Day16;

// 배열에서 문자열 대소문자 변환하기
public class day16_3 {
    public static void main(String[] args) {
        String[] strArr = {};
        for (int i = 0; i < strArr.length; i++) {
            if (i % 2 != 0) {
                strArr[i] = strArr[i].toUpperCase();
            } else if (i % 2 == 0) {
                strArr[i] = strArr[i].toLowerCase();
            }
        }
        System.out.println(strArr);
    }
}
