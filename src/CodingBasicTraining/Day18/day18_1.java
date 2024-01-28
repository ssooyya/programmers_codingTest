package CodingBasicTraining.Day18;

// x 사이의 개수
public class day18_1 {
    public static void main(String[] args) {
        String myString = "";
        String[] mysplit = {};
        mysplit = myString.split("x", -1);
        int[] answer = new int[mysplit.length];
        for (int i = 0; i < mysplit.length; i++) {
            answer[i] = mysplit[i].length();
        }
        System.out.println(answer);
    }
}
