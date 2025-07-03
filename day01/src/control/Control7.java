package control;

import java.util.Arrays;
import java.util.Scanner;

public class Control7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Command:");
            String command = sc.nextLine();
            System.out.println(command);

            if (command.equals("q")) {
                System.out.println("Quit...");
                break;
            } else if (command.equals("arr1")) {
                //1~10까지의 숫자를 하나 입력 받는다
                System.out.print("Enter Number1(1~10): ");
                String num1 = sc.nextLine();
                System.out.print("Enter Number2(1~10): ");
                String num2 = sc.nextLine();
                System.out.printf("Input Number %s %s\n", num1, num2);
                System.out.printf("plus  %s\n", num1 + num2);

                int n1 = Integer.parseInt(num1);
                int n2 = Integer.parseInt(num2);
                System.out.printf("plus  %s\n", n1 + n2);

            } else if (command.equals("arr2")) {
                //1개의 1~10까지의 숫자를 입력받는다
                //해당 사이즈의 1차원 배열을 생성한다
                //배열에 랜담하게 1~10까지의 값을 입력한다. 중복되지 않게 입력
                // 1. 배열값 출력
                // 2. 배열값이 합과 평균을 출력
                // 3. 최대, 최소 값 출력
                while (true) {
                    System.out.print("배열에 들어갈 Number(1~10): ");
                    int arrNum = sc.nextInt();
                    if (!(arrNum >= 1 && arrNum <= 10)) {
                        System.out.print("1부터 10까지의 숫자만 입력하세요\n");
                    } else {
                        int arr[] = new int[arrNum];

                        for (int i = 0; i < arr.length; i++) {
                            System.out.printf("%d___배열에 1부터 10까지의 숫자만 입력: ", i + 1);
                            int number = sc.nextInt();
                            if (number >= 1 && number <= 10) {
                                if (i == 0) {
                                    arr[i] = number;
                                } else {
                                    for (int j = 0; j < i; j++) {
                                        if (number == arr[j]) {
                                            i--;
                                            System.out.printf("%d번에 중복되는 숫자 발견!!!!!!!!!\n", i + 1);
                                            break;
                                        } else {
                                            arr[i] = number;
                                        }
                                    }
                                }
                            } else {
                                System.out.printf("%d___잘못입력함 ", i + 1);
                                i--;
                            }
                        }
                        int max = arr[0];
                        int min = arr[0];

                        for (int n : arr) {
                            if (max < n) {
                                max = n;
                            }
                            if (min > n) {
                                min = n;
                            }
                        }
                        int sum = 0;

                        for (int res : arr) {
                            sum += res;
                        }
                        double avg = 0.0;

                        avg = sum * 1.0 / arr.length;


                        System.out.printf("합계 : %d, 평균 : %5.2f, 최대 : %d, 최소 : %d\n", sum, avg, max, min);
                        break;
                    }
                }


            } else if (command.equals("arr3")) {
                // 한개의 1~50까지의 숫자를 입력 받는다
                // 해당 사이즈의 2차원 배열을 생성한다
                // 배열에 랜담하게 1~10까지의 값을 입력한다. 중복되지 않게 입력
                // 1. 배열값 출력
                // 2. 배열값이 합과 평균을 출력
                // 3. 최대, 최소 값 출력
                while (true) {
                    System.out.print("배열에 들어갈 Number1(1~10): ");
                    int arrNum = sc.nextInt();
                    System.out.print("배열에 들어갈 Number2(1~10): ");
                    int arrNum2 = sc.nextInt();
                    if (!(arrNum >= 1 && arrNum <= 10) && !(arrNum2 >= 1 && arrNum2 <= 10)) {
                        System.out.print("1부터 10까지의 숫자만 입력하세요\n");
                    } else {
                        int arr[][] = new int[arrNum][arrNum2];

                        for (int i = 0; i < arr.length; i++) {
                            for (int j = 0; j < arr[i].length; j++) {
                                System.out.printf("%d___배열에 1부터 50까지의 숫자만 입력: ", j + 1);
                                int num = sc.nextInt();
                                if (num >= 1 && num <= 50) {
                                    if (i == 0 && j == 0) {
                                        arr[i][j] = num;
                                    } else {
                                        boolean flag = true;
                                        point:
                                        for (int k = 0; k <= i; k++) {
                                            for (int n : arr[k]) {
                                                if (n == num) {
                                                    System.out.printf("%d 중복발생\n", j);
                                                    flag = false;
                                                    j--;
                                                    break point;
                                                }
                                            }
                                        }

                                        if (flag == true) {

                                            arr[i][j] = num;
                                        }

                                    }
                                } else {
                                    j--;
                                    System.out.printf("%d__1~50까지의 숫자만을 입력", j + 1);
                                }
                            }
                        }


                        for (int a[] : arr) {
                            for (int n : a) {
                                System.out.print(n + " ");
                            }
                            System.out.println();
                        }

                        int max = 0;
                        int min = 51;
                        int sum = 0;
                        for (int i = 0; i < arrNum; i++) {
                            for (int j = 0; j < arrNum2; j++) {
                                if (arr[i][j] > max) {
                                    max = arr[i][j];
                                }
                                if (arr[i][j] < min) {
                                    min = arr[i][j];
                                }
                                sum += arr[i][j];
                            }
                        }
                        double avg = 0.0;
                        avg = (double) sum / arr.length;

                        System.out.printf("합계 : %d, 평균 : %5.2f, 최대 : %d, 최소 : %d\n", sum, avg, max, min);
                        break;

                    }
                }
            } else {
                System.out.println("Invalid Command....");
            }
            sc.close();
            break;
        }
        System.out.println("End Application..");
    }
}

