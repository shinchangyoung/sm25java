package operation;

public class op1 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int result = num1++ + ++num2;
        // num1++ : 후위 증가 → 현재 값 10을 먼저 사용한 후, num1 = 11로 증가
        // ++num2 : 전위 증가 → num2 = 11로 먼저 증가한 후, 증가된 값(11)을 사용
        // 따라서 result = 10 + 11 = 21

        System.out.printf("%d %d %d\n", num1, num2, result);
        // num1은 ++ 연산 후 11
        // num2는 ++ 연산 전 증가했으므로 11
        // result는 10 + 11 = 21

        // 출력 결과: 11 11 21

    }
}
