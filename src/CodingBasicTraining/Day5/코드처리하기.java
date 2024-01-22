package CodingBasicTraining.Day5;

import java.util.Scanner;

// 코드 처리하기
public class 코드처리하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.next();
        String ret = "";
        int mode = 0;
        for (int idx = 0; idx < code.length(); idx++) {
            if (code.charAt(idx) == '1') {
                mode = mode == 0 ? 1 : 0;
                continue;
            }
            if (mode == 0 && idx % 2 == 0) {
                ret += code.charAt(idx);
            }
            if(mode == 1 &&  idx % 2 != 0){
                ret += code.charAt(idx);
            }
        }
        if (ret == null) {
            ret = "EMPTY";
        }

        System.out.println(ret);
    }
}
