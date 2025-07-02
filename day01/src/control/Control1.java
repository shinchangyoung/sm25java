package control;

public class Control1 {
    public static void main(String[] args) {
        int grade = 1;

        switch (grade) {
            case 1:
                System.out.println("냉장고");
                break; // grade가 1일 경우 여기서 switch 종료

            case 2:
                System.out.println("세탁기");
                break;

            case 3:
                System.out.println("TV");
                break;

            default:
                System.out.println("해당 없음");
                break;
        }
    }
}
