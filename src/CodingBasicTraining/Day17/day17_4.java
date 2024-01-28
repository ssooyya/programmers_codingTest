package CodingBasicTraining.Day17;

// 공백으로 구분하기 1
public class day17_4 {
    public static void main(String[] args) {
        String my_string = "";
        String[] answer = {};
        answer = my_string.split("\\s+");
        System.out.println(answer);
    }
}
