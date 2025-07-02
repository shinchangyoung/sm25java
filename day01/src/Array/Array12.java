package Array;

import java.util.Arrays;
import java.util.Scanner;

//5개에 배열에 1~20까지의 숫자를 입력하시오
//단, 중복되지 않게 입력 하고 짝수를 입력하지 마십시오.
//전체 배열을 출력 하시오
//배열에 최대, 최소 값을 출력 하시오.

public class Array12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int i = 0;
        int num = 0;
        int count = 1;

        while (true) {
            System.out.printf("%d번 숫자입력 : ", count);
            num = sc.nextInt();

            //20이하의 숫자만 입력
            if(num > 20){
                i--;
                count--;
                System.out.println("20이하의 숫자만 입력하세요");
            }

            //짝수만 입력하게 만듬
            if(!(num%2 == 0)){
                i--;
                count--;
                System.out.println("짝수만입력하세요");
            }

            //중복되지 않는 값
            if (i == 0 && num%2 ==0) {
                arr[i] = num;
            } else {
                for (int j = 0; j < i; j++) {
                    if (arr[j] == num) {
                        i--;
                        count--;
                        System.out.println("중복된값을입력 다시입력");
                    } else {
                        arr[i] = num;
                    }
                }
            }

            //5개의 값이 입력이 되면 반복문 탈출
            if(i == 4) break;

            //위에 조건문을 다만족시키면 증가
            i++;
            count++;
        }

        int max = arr[0];
        int min = arr[0];

        for(int n : arr){
            if(max < n){
                max = n;
            }
            if(min > n){
                min = n;
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.printf("최대: %d 최소: %d",max,min);

        sc.close();


    }
}
