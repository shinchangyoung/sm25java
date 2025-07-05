package game;

public class Animal {
    String food;


    public Animal() {
    }

    public Animal(String food) {
        this.food = food;
    }

    public void yieldFood() {
        System.out.println("yieldFood");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "food='" + food + '\'' +
                '}';
    }


}
