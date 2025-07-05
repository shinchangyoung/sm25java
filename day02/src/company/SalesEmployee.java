package company;

public class SalesEmployee extends  Employee {
    // memver variable
    // empNo, name, salary
    private  String loc;
    private  double bonus;

    public SalesEmployee() {

    }

    public SalesEmployee(double salary, String name, String loc, double bonus) {
        super(salary, name);
        this.loc = loc;
        this.bonus = bonus;
    }

//    public SalesEmployee(String name, String empNo, double salary, String loc, double bonus) {
//        super(name, empNo, salary);
//        this.loc = loc;
//        this.bonus = bonus;
//    }

    public String getLoc() {
        return loc;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public String toString() {
        return "SalesEmployee{" +
                "empNo='" + super.getEmpNo() + '\'' +
                ", Name=" + super.getName() +
                ",salary='" + super.getSalary() + '\'' +
                ",loc='" + loc + '\'' +
                ", bonus=" + bonus  +
                '}';
    }

    @Override
    public double getAnnualSalary() {
        //return super.getSalary() * 12 + bonus;
        return super.getAnnualSalary() +  bonus;
    }
}
