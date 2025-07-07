package exception;  // 패키지 이름

import java.io.*;    // 파일 입출력 관련 클래스들 임포트

public class Ex1 {
    public static void main(String[] args) {
        File file = null;  // File 객체 선언

        // 읽을 파일 경로 설정
        file = new File("C:\\Java\\sm25java\\day03\\src\\a.txt");

        Reader reader = null;  // 문자 단위 파일 입력을 위한 Reader 객체 선언

        try {
            // FileReader로 파일 열기
            reader = new FileReader(file);

            // BufferedReader로 감싸서 효율적인 라인 단위 읽기 가능
            BufferedReader br = new BufferedReader(reader);

            String line = null;  // 한 줄씩 읽어올 변수

            // 파일 끝까지 한 줄씩 읽어서 출력
            while (true) {
                line = br.readLine();  // 한 줄 읽기
                if (line == null) break;  // EOF(End of File)인 경우 종료
                System.out.println(line);  // 읽은 줄 출력
            }

        } catch (FileNotFoundException e) {
            // 파일이 존재하지 않거나 경로가 잘못되었을 때
            System.out.println("File not found");
            return;  // 프로그램 종료
        } catch (IOException e) {
            // 읽기 도중 입출력 오류가 발생했을 때
            System.out.println("IO Error");
            return;  // 프로그램 종료
        }

        /*
        // 모든 예외를 한 번에 처리하고 싶을 때 사용하는 범용 처리
        catch (Exception e) {
            System.out.println("Exception : " + e);
            return;
        }
        */
    }
}
 /*
 *  // FileReader를 BufferedReader로 감싸서 성능 향상 및 라인 단위 읽기 가능
        BufferedReader br = new BufferedReader(reader);

        String line = null;  // 한 줄씩 읽어올 문자열 변수

        while (true) {
            try {
                // 한 줄씩 파일 읽기
                line = br.readLine();
            } catch (IOException e) {
                // 읽기 중 에러 발생 시
                System.out.println("Error reading file");  // 사용자에게 알림
                break;  // 반복문 종료
            }

            // 파일의 끝(EOF)에 도달하면 null 반환되므로 종료 조건
            if (line == null) break;

            // 읽은 줄 출력
            System.out.println(line);
        }
 * */