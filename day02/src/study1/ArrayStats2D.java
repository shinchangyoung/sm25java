package study1;

public class ArrayStats2D {
    private int[][] arr;

    public ArrayStats2D(int[][] arr) {
        this.arr = arr;
    }

    public int getMax() {
        int max = arr[0][0];
        for (int[] row : arr) {
            for (int n : row) {
                if (n > max) max = n;
            }
        }
        return max;
    }

    public int getMin() {
        int min = arr[0][0];
        for (int[] row : arr) {
            for (int n : row) {
                if (n < min) min = n;
            }
        }
        return min;
    }

    public int getSum() {
        int sum = 0;
        for (int[] row : arr) {
            for (int n : row) {
                sum += n;
            }
        }
        return sum;
    }

    public double getAvg() {
        int totalElements = arr.length * arr[0].length;
        return (double) getSum() / totalElements;
    }

    public ArrayStatsResult getAllStats() {
        int sum = getSum();
        double avg = getAvg();
        int max = getMax();
        int min = getMin();
        return new ArrayStatsResult(sum, avg, max, min);
    }

    // 내부 static 클래스로 통계 결과 표현
    public static class ArrayStatsResult {
        public int sum;
        public double avg;
        public int max;
        public int min;

        public ArrayStatsResult(int sum, double avg, int max, int min) {
            this.sum = sum;
            this.avg = avg;
            this.max = max;
            this.min = min;
        }

        @Override
        public String toString() {
            return String.format("합계: %d, 평균: %.2f, 최대값: %d, 최소값: %d", sum, avg, max, min);
        }
    }

}
