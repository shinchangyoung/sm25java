package Array;

import java.util.Random;

public class Array1 {

    //java에서는 배열은 가변이다 -> 그래서 현장에서는 잘 사용이 되지 않는다
    public static void main(String[] args) {
        //Reference Type
        //int[] arr;
        //배열은 reference타입이기 때문에 new로 생선을 해야하고
        // 방법은 두가지 방법이 존재
        int[] arr1 = new int[10];
        int arr2 [] = new int[10];
        int [] arr3  = {1,2,3,4,5};

        Random rand = new Random();

        for(int i=0;i<5;i++){
            arr1[i]= rand.nextInt(10) + 1; //0~10
        }

        for(int i=0;i<5;i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        for(int n:arr1){
            System.out.print(n + " ");
        }

    }
}
