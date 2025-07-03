package array;

import java.util.Random;

public class Array3 {
    public static void main(String[] args) {
        // 5행 5열의 배열에
        //1~100까지의 random 한 숫자를 입력한다
        //단, 중복되서 들어가면 안된다
        //최종 베열을 출력
        Random rand = new Random();
        int arr [][] = new int[3][3];


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int num = rand.nextInt(10) + 1;
                if (i == 0 && j == 0) {
                    arr[i][j] =num;
                } else {
                        for (int k = 0; k < 3; k++) {
                            for(int n : arr[k]) {}
                        }
                    }
                }
            }



        for(int n[] : arr){
            for(int num : n){
                System.out.print(num+" ");
            }
            System.out.println();
        }


    }
}
