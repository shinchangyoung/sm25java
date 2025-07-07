package Collection;

import java.util.HashMap;
import java.util.Map;

public class Collection3 {
    public static void main(String[] args) {
        //Map (key,Value)
        Map<String,Integer> map = new HashMap<>();
        map.put("a",2);
        map.put("b",3);
        map.put("c",4);
        map.put("d",5);

        for(String a : map.keySet()){
            System.out.print(a + " ");
        }

        System.out.println();

        for(Integer s : map.values()){
            System.out.print(s + " ");
        }
    }

}
