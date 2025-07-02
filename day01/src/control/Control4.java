package control;

public class Control4 {
    public static void main(String[] args) {
        //1~10까지의 숫자중 짝수의 합과 평균
        //for
        int sum = 0;
        double avg = 0.0;
        int count = 0;

        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                sum += i;
                count++;
                }
        }

        avg = sum * 1.0/count;
        System.out.println(sum);
        System.out.printf("%d, %1.2f\n",sum, avg);


    }
}
