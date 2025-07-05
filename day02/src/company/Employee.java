package company;

import java.util.UUID;

public class Employee {

    private String name;
    private String empNo;
    private double salary;

    public Employee() {

    }

    public Employee(double salary, String name) {
        this.empNo = UUID.randomUUID().toString();
        this.salary = salary;
        this.name = name;
    }


    public Employee(String name, String empNo, double salary) {
        this.name = name;
        this.empNo = empNo;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getEmpNo() {
        return empNo;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", empNo='" + empNo + '\'' +
                ", salary=" + salary +
                '}';
    }

    public double getAnnualSalary() {
        return salary * 12;
    }

    public double getMonthlySalary(double taxRate) {
        return (salary * 12) - (salary * taxRate);
    }

}
