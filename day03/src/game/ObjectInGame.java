package game;

public abstract class ObjectInGame {
    protected String name;
    protected int location [] = new int[2];
    protected int health ;
    protected int weight ;

    public ObjectInGame() {}

    public ObjectInGame(String name, int[] location, int health, int weight) {
        this.name = name;
        this.location = location;
        this.health = health;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "ObjectInGame{" +
                "name='" + name + '\'' +
                ", location=" + location +
                ", health=" + health +
                ", weight=" + weight +
                '}';
    }

    public abstract void gone ();
}
