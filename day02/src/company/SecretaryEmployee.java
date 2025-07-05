package company;

public class SecretaryEmployee extends Employee {
    private String boss;

    public SecretaryEmployee() {

    }

    public SecretaryEmployee(String boss) {
        this.boss = boss;
    }

    public SecretaryEmployee(double salary, String name, String boss) {
        super(salary, name);
        this.boss = boss;
    }

    public SecretaryEmployee(String name, String empNo, double salary, String boss) {
        super(name, empNo, salary);
        this.boss = boss;
    }

    public String getBoss() {
        return boss;
    }

    @Override
    public String toString() {
        return "SecretaryEmployee{" +
                "boss='" + boss + '\'' +
                '}';
    }
}
