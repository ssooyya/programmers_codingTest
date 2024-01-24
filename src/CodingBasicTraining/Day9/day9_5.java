package CodingBasicTraining.Day9;

// 접미사인지 확인하기
public class day9_5 {
    public static void main(String[] args) {
        String my_string = "";
        String is_suffix = "";
        int answer = 0;

//        if (is_suffix.length() <= my_string.length()) {
//            int suf = is_suffix.length();
//            String suffix = my_string.substring(my_string.length() - is_suffix.length());
//            if (suffix.equals(is_suffix)) {
//                answer = 1;
//            } else {
//                answer = 0;
//            }
//        }
        answer = my_string.endsWith(is_suffix) ? 1: 0;
        System.out.println(answer);
    }
}
