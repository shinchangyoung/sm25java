package study1;

import java.util.Scanner;

public class InputHelper {
    public static int readIntInRange(Scanner sc, String prompt, int min, int max) {
        while (true) {
            System.out.print(prompt);
            try {
                int num = sc.nextInt();
                sc.nextLine(); // 개행 문자 제거
                if (num >= min && num <= max) {
                    return num;
                } else {
                    System.out.printf("%d부터 %d까지의 숫자만 입력하세요.\n", min, max);
                }
            } catch (Exception e) {
                System.out.println("숫자를 정확히 입력하세요.");
                sc.nextLine(); // 잘못된 입력 제거
            }
        }
    }
}
