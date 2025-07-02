package control;

public class Control2 {
    public static void main(String[] args) {
        // 1~10까지의 합과 평균을
        // for문을 이용하여 구하시요

        int sum = 0;
        double avg = 0.0;
        int count = 0;

        for (int i = 0; i <= 10; i++) {
            sum = sum + i;
            count++;
        }
        avg = Double.valueOf(sum)/ count;

        System.out.println(sum);
        System.out.printf("%1.2f\n",avg);

    }
}
