package operation;

public class op2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // a++ > 0 || ++b < 0 or연산자가 두개면 뒤에 연산은 연산되지 않음
        if(a++ > 0 && ++b < 0){
            System.out.println("OK");
        }else {
            System.out.println("False");
        }
        System.out.printf(" %d, %d\n", a,b);
    }
}
