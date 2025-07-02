package control;

public class Control3 {
    public static void main(String[] args) {
        //1~10까지 함과 평균 구하시오
        //while

        int count = 0;
        int sum = 0;
        double avg = 0.0;
        while (count < 10) {
            count++;
            sum += count ;

        }
        avg = Double.valueOf(sum) / count;

        System.out.println(sum);
        System.out.println(avg);
    }
}
