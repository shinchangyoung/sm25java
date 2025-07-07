package shop.app;

import shop.dto.CustDto;
import shop.frame.SmService;
import shop.service.CustService;

import java.util.List;
import java.util.Scanner;

public class CustApp {

    // 📌 고객 메뉴를 출력하는 함수 (매번 반복 출력하지 않도록 함수로 분리)
    public static void showCustMenu() {
        System.out.println("\n===== 고객 메뉴 =====");
        System.out.println("i - 회원 등록");
        System.out.println("u - 회원 정보 수정");
        System.out.println("s - 회원 검색");
        System.out.println("d - 회원 삭제");
        System.out.println("q - 나가기");
        System.out.print("선택 >> ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // 사용자 입력 받기 위한 Scanner 객체 생성

        // SmService 인터페이스를 구현한 CustService 인스턴스 생성
        SmService<CustDto, String> smService;
        smService = new CustService();

        // 무한 루프: 사용자 명령을 반복적으로 받아 처리
        while (true){

            showCustMenu();  // 메뉴 출력
            String command = sc.nextLine();  // 명령 입력받기
            System.out.println(command);     // 입력된 명령 출력 (디버깅용)

            // q 입력 시 종료
            if(command.equals("q")){
                System.out.println("Quit...");
                break;
            }

            // 등록
            else if(command.equals("i")){
                System.out.println("==회원등록==");

                // 사용자로부터 ID, 비밀번호, 이름 입력받기
                System.out.print("id 입력 : ");
                String rID = sc.nextLine();

                System.out.print("pd 입력 : ");
                String rPassword = sc.nextLine();

                System.out.print("name 입력 : ");
                String rName = sc.nextLine();

                // 입력값으로 CustDto 객체 생성 후 register()
                CustDto custDto = new CustDto(rID, rPassword, rName);
                smService.register(custDto);
            }

            // 특정 고객 조회
            else if(command.equals("s")){
                System.out.println("==고객 조회==");

                // 조회할 ID 입력
                System.out.print("조회할 id 입력 : ");
                String sId = sc.nextLine();

                CustDto myInfo = null;

                // 서비스 계층을 통해 고객 정보 조회
                myInfo = smService.get(sId);

                // 결과 출력
                System.out.println(myInfo);
            }

            // 모든 고객 조회
            else if(command.equals("sa")){
                System.out.println("== 모든 고객 조회==");

                List<CustDto> custs = null;

                // 전체 고객 리스트 조회
                custs = smService.get();

                // 결과 출력
                for (CustDto cust : custs) {
                    System.out.println(cust);
                }
            }

            // 특정 고객 삭제
            else if(command.equals("d")){
                System.out.println("== 고객 삭제==");

                // 삭제할 ID 입력
                System.out.print("삭제할 id 입력 : ");
                String dId = sc.nextLine();

                // 삭제 실행
                smService.remove(dId);
            }

            // 특정 고객 수정
            else if(command.equals("u")){
                System.out.println("== 정보 수정==");

                // 수정할 ID 및 정보 입력
                System.out.print("id 입력 : ");
                String newID = sc.nextLine();

                System.out.print("pd 입력 : ");
                String newPassword = sc.nextLine();

                System.out.print("name 입력 : ");
                String newName = sc.nextLine();

                // 수정된 정보로 새로운 CustDto 생성
                CustDto newCust = new CustDto(newID, newPassword, newName);

                // 정보 수정 요청
                smService.modify(newCust);
            }

            // 잘못된 명령 처리
            else {
                System.out.println("Invalid Command....");
            }
        }

        // 입력 종료 시 자원 해제
        sc.close();
    }
}
