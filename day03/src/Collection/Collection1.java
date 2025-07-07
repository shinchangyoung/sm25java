package Collection;

import java.util.ArrayList;
import java.util.List;

public class Collection1 {
    public static void main(String[] args) {
        // List, Set, Map
        List<String> list = new ArrayList();
        list.add("A");
        list.add("a");
        list.add("2");
        list.add("2");

        // toString이 호출되었다
        System.out.println(list);

        // 위에서 list를 추가한 값이 String이라도 추가한건 실제로 객체 값을 추가하였기 때문에
        //String으로 값을 끄집어 낼게 아니라 Object로 값을 끄집어낸다
        //List list = new ArrayList();
        for(Object a : list){
            System.out.print(a + " ");
        }

        System.out.println();

        //List<String> list = new ArrayList();
        for(String a : list){
            System.out.print(a + " ");
        }

        System.out.println();
        List<Integer> list1 = new ArrayList();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        for(Integer a : list1){
            System.out.print(a + " ");
        }


    }
}
