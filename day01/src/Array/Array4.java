package Array;

//5개에 배열에 1~10까지의 숫자를 랜덤하게 입력하세요
//단, 중복되지 않게 입력 하세요
//전체 배열을 출력 하시오
//배열에 최대, 최소 값을 출력 하시오

import java.util.Arrays;
import java.util.Random;


public class Array4 {
    public static void main(String[] args) {
        Random rand = new Random();


        int[] arr = new int[5];
        int count = 0;


        while(true){
            int num = rand.nextInt(10)+1;

            if(count == 0){
                arr[count] = num;
            }else{
                for(int j=0;j<count;j++){
                    if(arr[j] == num){
                        count--;
                        break;
                    }else{
                        arr[count] = num;
                    }
                }
            }

            if(count == 4){
                break;
            }

            count++;
        }

        int max = 0;
        int min = 11;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.printf("최대: %d 최소: %d", max, min);


    }
}
