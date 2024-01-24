package CodingBasicTraining.Day10;

// 접두사인지 확인하기
public class day10_2 {
    public static void main(String[] args) {
        String my_string = "";
        String is_prefix = "";
        int answer = 0;
//        if (is_prefix.length() > my_string.length()) {
//            int pre = is_prefix.length();
//            String prefix = my_string.substring(my_string.length() - is_prefix.length());
//            if (prefix.equals(is_prefix)){
//                answer = 1;
//            } else {
//                answer = 0;
//            }
//        }
        answer = my_string.startsWith(is_prefix)? 1 : 0;

        System.out.println(answer);

    }
}
