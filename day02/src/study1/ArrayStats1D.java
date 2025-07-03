package study1;

public class ArrayStats1D {
    private int[] arr;

    public ArrayStats1D(int[] arr) {
        this.arr = arr;
    }

    public int getMax() {
        int max = arr[0];
        for (int n : arr) {
            if (n > max) max = n;
        }
        return max;
    }

    public int getMin() {
        int min = arr[0];
        for (int n : arr) {
            if (n < min) min = n;
        }
        return min;
    }

    public int getSum() {
        int sum = 0;
        for (int n : arr) {
            sum += n;
        }
        return sum;
    }

    public double getAvg() {
        return (double) getSum() / arr.length;
    }


    public void result(){
        int sum = getSum();
        double avg = getAvg();
        int max = getMax();
        int min = getMin();

        System.out.printf("합계: %d, 평균: %.2f, 최대값: %d, 최소값: %d\n", sum, avg, max, min);
    }
}
