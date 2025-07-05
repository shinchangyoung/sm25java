package solotion;

import java.util.Random;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();


        System.out.print("입력 : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

            if (n1 >= 1 && n1 <= 100) {
                int arr[] = new int[n1];
                for (int i = 0; i < n1; i++) {


                    arr[i] = rand.nextInt(100) + 1;

                }
                for(int n : arr){
                    System.out.print(n + " ");
                }
            }


    }
}