package study1;

import java.util.Scanner;

public class Control7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayService arrayService = new ArrayService(sc);

        while (true) {
            System.out.print("Enter Command:");
            String command = sc.nextLine();

            if (command.equals("q")) {
                System.out.println("Quit...");
                break;
            } else if (command.equals("arr1")) {
                arrayService.arr1();
            } else if (command.equals("arr2")) {
                arrayService.arr2();
            } else if (command.equals("arr3")) {
                arrayService.arr3();
            } else {
                System.out.println("다른수를 입력하였습니다....");
            }
        }

        sc.close();
        System.out.println("End Application..");
    }
}
