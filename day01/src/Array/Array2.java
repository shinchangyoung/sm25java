package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        //3번 문자를 입력받아 배열을 출력하시오
        String[] strs = new String[3];
        Scanner sc = new Scanner(System.in);

        int i = 0;
        while(i < 3){
            System.out.print("입력 : ");
            strs[i] = sc.next();
            i++;
        }
        System.out.println(Arrays.toString(strs));
        sc.close();
    }

}
