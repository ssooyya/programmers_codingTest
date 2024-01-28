package CodingBasicTraining.Day18;

// 간단한 식 계산하기
public class day18_3 {
    public static void main(String[] args) {
        String binomial = "";
        int answer = 0;

        String[] bisplit = binomial.split(" ");
        int a = Integer.parseInt(bisplit[0]);
        String op = bisplit[1];
        int b = Integer.parseInt(bisplit[2]);

        if (op.equals("+")) {
            answer = a + b;
        } else if (op.equals("-")) {
            answer = a - b;
        } else if (op.equals("*")){
            answer = a * b;
        }
        System.out.println(answer);
    }
}
