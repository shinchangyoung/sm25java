package study1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayService {
    private Scanner sc;

    public ArrayService(Scanner sc) {
        this.sc = sc;
    }

    public void arr1() {
        System.out.print("Enter Number1(1~10): ");
        String num1 = sc.nextLine();
        System.out.print("Enter Number2(1~10): ");
        String num2 = sc.nextLine();
        System.out.printf("Input Number %s %s\n", num1, num2);
        System.out.printf("plus  %s\n", num1 + num2);

        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        System.out.printf("plus  %s\n", n1 + n2);
    }

    public void arr2() {
        int arrNum = InputHelper.readIntInRange(sc, "배열에 들어갈 Number(1~10): ", 1, 10);
        int[] arr = new int[arrNum];

        for (int i = 0; i < arr.length; i++) {
            int number = InputHelper.readIntInRange(sc, String.format("%d___배열에 1부터 10까지의 숫자만 입력: ", i + 1), 1, 10);
            boolean duplicate = false;

            for (int j = 0; j < i; j++) {
                if (arr[j] == number) {
                    System.out.println("중복된 숫자입니다. 다시 입력해주세요.");
                    duplicate = true;
                    i--;
                    break;
                }
            }

            if (!duplicate) arr[i] = number;
        }

        ArrayStats1D asr1 = new ArrayStats1D(arr);
        asr1.result();
    }

    public void arr3() {
        int row = InputHelper.readIntInRange(sc, "배열에 들어갈 Number1(1~10): ", 1, 10);
        int col = InputHelper.readIntInRange(sc, "배열에 들어갈 Number2(1~10): ", 1, 10);

        int[][] arr = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int num = InputHelper.readIntInRange(sc, String.format("%d___1~50 숫자 입력: ", j + 1), 1, 50);

                boolean duplicate = false;
                for (int k = 0; k <= i; k++) {
                    for (int n : arr[k]) {
                        if (n == num) {
                            System.out.println("중복된 숫자입니다.");
                            j--;
                            duplicate = true;
                            break;
                        }
                    }
                    if (duplicate) break;
                }

                if (!duplicate) arr[i][j] = num;
            }
        }
        ArrayStats2D stats = new ArrayStats2D(arr);
        ArrayStats2D.ArrayStatsResult result = stats.getAllStats();

        System.out.println(result);

    }
}
