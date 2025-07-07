package bank;

public class Atm {
    public static void main(String[] args) {
        Account account = new Account(10000);
        System.out.println(account);
        try {
            account.withdraw(20000);
        } catch (NotEnoughBalanceException e) {
            System.out.println("잔액이 부족합니다.");

        }
        //catch (NegativeValueException e){
          //  System.out.println("양수 금액을 입금해주세요.");
        //}

        System.out.println(account);
    }
}
