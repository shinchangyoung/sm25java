package Car;

public class Car {
    private String name;
    private String color;
    private double size;

    public Car() {
        this.name = "Default";
        this.color = "White";
        this.size = 100;
    }

    public Car(String name, String color, double size) {
        this.name = name;
        this.color = color;
        this.size = size;
    }

    public void go(){
        System.out.printf("%s Car go \n", this.name);
    }
    public void stop(){
        System.out.printf("%s Car stop\n", this.name);
    }

}
