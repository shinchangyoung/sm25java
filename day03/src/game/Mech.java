package game;

public class Mech {
    private double power;

    public Mech() {}

    public Mech(double power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Mech{" +
                "power=" + power +
                '}';
    }

    public void work(){
        System.out.println("Mech work");
    }

}
