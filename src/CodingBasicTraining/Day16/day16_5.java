package CodingBasicTraining.Day16;

// 특정한 문자를 대문자로 바꾸기
public class day16_5 {
    public static void main(String[] args) {
        String my_string = "";
        String alp = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) == alp.charAt(0)) {
                sb.append((char) (my_string.charAt(i) - 32));
            } else {
                sb.append(my_string.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}