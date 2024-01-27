package CodingBasicTraining.Day16;

// A 강조하기
public class day16_4 {
    public static void main(String[] args) {
        String myString = "";
        StringBuilder sb = new StringBuilder(myString.toLowerCase());
        for (int i = 0; i < myString.length(); i++) {
            if (sb.charAt(i) == 'a') {
                sb.replace(i, i+1, "A");
            }
        }
        System.out.println(sb.toString());
    }
}
