package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Exception 예외

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number ");
        int num = 0;

        // 예외처리코드 작성전 InputMismatchException으로 잡아줌
        try {
            num = sc.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Please enter a number");
            return;
        }
        int a[] = null;

        //Exception 으로 잡아준다 Exception은 모든 예외처리에 대한 상위 클래스이기 때문에
        try{
            a = new int[num];
        }catch (Exception e){
            System.out.println("Please enter a Positive number");
            return;
        }

        for(int i=0;i < a.length;i++){
            System.out.printf("%d ", a[i]);

        }
    }
}
