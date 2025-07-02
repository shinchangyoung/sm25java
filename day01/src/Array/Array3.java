package Array;

import java.util.Arrays;

public class Array3 {
    public static void main(String[] args) {
        // 문자열 배열 선언 및 초기화 (크기 3)
        String[] strs = new String[3];
        strs[0] = "A";   // 첫 번째 요소에 "A" 저장
        strs[1] = "B";   // 두 번째 요소에 "B" 저장
        strs[2] = "C";   // 세 번째 요소에 "C" 저장

        // 배열 내용을 문자열 형태로 출력
        System.out.println(Arrays.toString(strs)); // 결과: [A, B, C]

        // 문자열을 효율적으로 이어 붙이기 위한 StringBuffer 객체 생성
        // StringBuffer는 문자열을 수정할 수 있는(mutable) 객체로,
        // 문자열을 여러 번 덧붙일 때 새로운 객체를 계속 생성하지 않고 효율적으로 처리함
        StringBuffer sb = new StringBuffer();

        // 향상된 for문으로 배열 요소 하나씩 꺼내서 StringBuffer에 추가
        for (String s : strs) {
            sb.append(s); // 문자열 추가 (A + B + C)
        }

        // 결과 출력: ABC
        System.out.println(sb);
    }
}
