package variable;

// Reference Type과 Primitive Type 차이를 설명하기 위한 코드
// String은 Reference Type으로, 객체로 취급되며 메모리에 저장 방식에 따라 비교 결과가 달라집니다.

public class St1 {
    public static void main(String[] args) {

        // Heap 메모리에 새로운 String 객체 생성 (항상 새 객체 생성)
        String st1 = new String("abc");  // 새로운 객체 생성
        String st2 = new String("abc");  // 또 다른 새로운 객체 생성

        // String literal은 String Pool 영역에 저장됨 (중복 문자열은 재사용)
        String st3 = "abc";  // String Pool에 "abc" 저장
        String st4 = "abc";  // 이미 있는 "abc"를 재사용

        // st1과 st2는 서로 다른 객체이므로 주소값이 다르다 (Heap 영역에서 서로 다른 객체)
        if(st1 == st2){
            System.out.println("OK1");  // 출력되지 않음
        }

        // st1은 Heap에 있는 객체이고, st3는 Pool에 있는 객체이므로 주소값이 다름
        if(st1 == st3){
            System.out.println("OK2");  // 출력되지 않음
        }

        // st3와 st4는 모두 String Pool에 같은 리터럴 "abc"를 참조하므로 주소값이 같음
        if(st3 == st4){
            System.out.println("OK3");  // 출력됨
        }

        // .equals()는 문자열의 값을 비교하므로 st1과 st3는 "abc"라는 같은 문자열이라 true
        if(st1.equals(st3)){
            System.out.println("OK5");  // 출력됨
        }
    }
}
