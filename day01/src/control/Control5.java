package control;

public class Control5 {
    public static void main(String[] args) {
        int sum = 0;
        int num = 0;
        double avg = 0.0;
        int count = 0;
        while (num < 10) {
            num = num + 2;
            sum += num;
            count++;
        }


        System.out.println("sum = " + sum);
        System.out.println("avg = " + sum * 1.0/count);
    }
}
