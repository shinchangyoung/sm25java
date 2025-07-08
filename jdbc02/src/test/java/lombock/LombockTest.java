package lombock;

import eud.sm.dto.Cust;
import org.junit.jupiter.api.Test;


public class LombockTest {
    @Test
    public void test1(){
        System.out.println("Lombock Test1...");
        Cust cust = Cust.builder()
                .custId("id21")
                .custPwd("pw22")
                .custName("신창영")
                .build();
        System.out.println(cust);
    }

    @Test
    public void test2(){
        System.out.println("Lombock Test2...");
    }
}
