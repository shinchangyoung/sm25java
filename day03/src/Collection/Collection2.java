package Collection;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Collection2 {
    public static void main(String[] args) {
        //set
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");


        for(String a : set){
            System.out.println(a);
        }


        //set을 이용하여(1~10)까지의 6개의 숫자를 Set에 입력하고 출력 하시오
        Set<Integer> set1 = new HashSet<>();
        Random random = new Random();
        while (set1.size() < 6){
            set1.add(random.nextInt(10)+1);
        }

        for(Integer a : set1){
            System.out.println(a);
        }


    }
}
