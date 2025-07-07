package shop.app;

import shop.dto.CustDto;
import shop.dto.ItemDto;
import shop.frame.SmService;
import shop.service.ItemService;

import java.util.List;
import java.util.Scanner;

public class ItemApp {

    public static void showItemMenu() {
        System.out.println("\n===== 상품 메뉴 =====");
        System.out.println("i - 상품 등록");
        System.out.println("u - 상품 정보 수정");
        System.out.println("s - 상품 검색");
        System.out.println("d - 상품 삭제");
        System.out.println("q - 나가기");
        System.out.print("선택 >> ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ItemService itemService = new ItemService();


        while (true){

            showItemMenu();
            String command = sc.nextLine();
            System.out.println(command);


            if(command.equals("q")){
                System.out.println("Quit...");
                break;
            }
            //등록
            else if(command.equals("i")){
                System.out.println("== 상품등록 ==");
                System.out.print("id 입력 : ");
                String rID = sc.nextLine();

                System.out.print("name 입력 : ");
                String itemName = sc.nextLine();

                System.out.print("price 입력 : ");
                String price = sc.nextLine();

                ItemDto itemDto = new ItemDto(Integer.parseInt(rID), itemName, Integer.parseInt(price));
                itemService.register(itemDto);

            }
            //특정 고객 조회
            else if(command.equals("s")){
                System.out.println("==상품 조회==");
                System.out.print("조회할 id Insert : ");
                String iid = sc.nextLine();
                ItemDto myInfo = null;
                myInfo = itemService.get(Integer.parseInt(iid));
                System.out.println(myInfo);

            }
            //모든 고객 조회
            else if(command.equals("sa")){
                System.out.println("==모든 상품 조회==");
                List<ItemDto> items = null;
                items = itemService.get();
                for (ItemDto itemDto : items) {
                    System.out.println(itemDto);
                }
            }
            //특정 고객 삭제
            else if(command.equals("d")){
                System.out.println("==상품 삭제==");
                System.out.print("삭제할 id 입력: ");
                String dID = sc.nextLine();
                itemService.remove(Integer.parseInt(dID));
            }
            //특정 고객 수정
            else if(command.equals("u")){
                System.out.println("== 정보 수정==");

                System.out.print("id 입력 : ");
                String newID = sc.nextLine();

                System.out.print("name 입력 : ");
                String newName = sc.nextLine();

                System.out.print("price 입력 : ");
                String newPrice = sc.nextLine();
                ItemDto newItem = new ItemDto(Integer.parseInt(newID), newName, Integer.parseInt(newPrice));
                itemService.modify(newItem);

            }


        }
        sc.close();
    }
}

