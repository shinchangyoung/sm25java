package operation;

public class op4 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        //3수의 최대값과 최소값을 구하시오.
        if(a > b && a > c){
            System.out.printf("a는 최댓값 ",a);
        }
        if(b > a && b > c){
            System.out.printf("b는 최댓값 ",b);
        }
        if(c > a && c > b){
            System.out.printf("c는 최댓값 ",b);
        }


        if(a < b && a < c){
            System.out.printf("a는 최솟값 ",a);
        }
        if(b < a && b < c){
            System.out.printf("b는 최솟값 ",b);
        }
        if(c < a && c < b){
            System.out.printf("c는 최솟값 ",b);
        }


    }
}
