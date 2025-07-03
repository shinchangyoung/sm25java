package Car;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start Application..");
        Car car = new Car();
        car.go();
        car.stop();

        Car car1 = new Car("ki","red",100);
        System.out.println();

        System.out.println("End Application..");
    }
}
