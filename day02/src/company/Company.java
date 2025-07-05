package company;

public class Company {
    public static void main(String[] args) {
        Employee e = new Employee(1000.0,"신창영");
        SalesEmployee es = new SalesEmployee(1000.0,"norihiro","서울",1000.0);
        SecretaryEmployee sc = new SecretaryEmployee(1000.0,"toyoaki","이보스");

        System.out.println(e);
        System.out.println(e.getAnnualSalary());
        System.out.println(es.getAnnualSalary());
    }
}

