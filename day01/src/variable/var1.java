package variable;

public class var1 {
    public static void main(String[] args) {

    int inputNumber = 10;
    // 기본적인 정수형 변수 선언. 10은 정수이므로 int 타입에 저장 가능

    int intNum = 2100000000;
    // int는 32비트(4바이트) 정수형. 약 -21억 ~ +21억 사이 값 저장 가능
    // 2100000000은 int의 범위 안에 있는 큰 수이지만 저장 가능

    long doubleNum = 2100000000L;
    // double은 64비트(8바이트) 실수형. D는 double형임을 명시함
    // 정수도 double로 표현 가능하며, 정밀도와 크기가 더 큼

    byte b1 = 100;
    byte b2 = 100;
    // 산술 연산 시 자동으로 int로 변환됨
    // byte b3 = b1 + b2; // 컴파일 오류!
    // 그래서 형 변환 필요:
    byte b3 = (byte)(b1 + b2); // 200 → (byte) → -56

    System.out.println(b3); // -56 출력

    // 실수 double
    float f1 = 10000000.0F;  // float 타입 실수, 접미사 F 꼭 필요!
    float f2 = 10000000.0F;  // 동일한 값
    float f3 = f1 + f2;      // float + float → 결과도 float
    System.out.println(f3);  // 출력값: 20000000.0
    double d2 = 10000000.0;

    int num1 = 1500000000;
    // int는 32bit(4byte) 정수형으로, 표현 가능한 범위는 약 -21억 ~ +21억
    // 1,500,000,000은 범위 안이므로 저장 가능

    int num2 = 1500000000;
    // 같은 값 저장

    int result = num1 + num2;
    // 두 값을 더하면 3,000,000,000이 됨
    // BUT! int 최대값(2,147,483,647)을 초과하므로 오버플로우 발생
    // Java에서 int는 자동으로 넘치는 값을 순환시켜버림 (2의 보수 처리)
    // 결과적으로 이상한 음수 값이 저장됨

    System.out.println(result);
    // 실제 출력값: -1294967296 (엉뚱한 음수값)


}
}

