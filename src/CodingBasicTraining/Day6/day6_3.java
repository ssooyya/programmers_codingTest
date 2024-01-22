package CodingBasicTraining.Day6;

// 수 조작하기2
public class day6_3 {
    public static void main(String[] args) {
        int[] numLog = {};
        String answer = "";

        for (int i = 1; i < numLog.length; i++) {
            if (numLog[i] - numLog[i-1] == 1) {
                answer += "w";
            } else if (numLog[i] - numLog[i - 1] == -1){
                answer += "s";
            } else if (numLog[i] - numLog[i - 1] == 10){
                answer += "d";
            } else if (numLog[i] - numLog[i - 1] == -10){
                answer += "a";
            }
        }
        System.out.println(answer);
    }
}
