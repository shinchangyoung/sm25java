package control;

import java.util.Scanner;

public class Control6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("Enter Command:");
            String command = sc.nextLine();
            System.out.println(command);

            if(command.equals("q")){
                System.out.println("Quit...");
                break;
            }else if(command.equals("s")){
                System.out.println("Insert...");
            }else if(command.equals("d")){
                System.out.println("Delete...");
            }else if(command.equals("u")){
                System.out.println("Update...");
            }else {
                System.out.println("Invalid Command....");
            }
        }
        sc.close();
//   코드에서 sc.close()는 실행되지 않는다. -> while (true) 무한 루프 안에 break가 없기 때문.
    }
}
