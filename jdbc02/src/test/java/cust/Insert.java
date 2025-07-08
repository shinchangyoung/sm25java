package cust;

import eud.sm.dto.Cust;
import eud.sm.service.CustService;
import org.junit.jupiter.api.Test;

public class Insert {
    @Test
    public void insert(){
        System.out.println("insert Test Start...");
        CustService custService = new CustService();
        Cust cust = Cust.builder()
                .custId("id39")
                .custPwd("pwd55")
                .custName("신장훈")
                .build();
        try {
            custService.register(cust);
            System.out.println("등록 정상");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("등록 오류");

        }

    }
}
