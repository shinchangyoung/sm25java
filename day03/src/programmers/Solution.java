package programmers;

import java.util.Scanner;

public class Solution {
    public int solution(int num) {
        int answer = 0;
        long n = num;

        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else if(num % 2 != 0) {
                n *= 3;
                n++;
            }
             if (answer >= 500) {
                 answer = -1;
                 return answer;
            }
            answer++;
        }
        return answer;
    }


    public static void main (String[]args){
        Solution s = new Solution();
        int result = s.solution(626331);
        System.out.println("수: " + result);
    }


}
