package game;

import java.util.Arrays;

public class Playable extends Actor {
    protected int hunger;
    protected String [] inventory = new  String[5];

    public Playable() {}

    public Playable(int hunger, String[] inventory) {
        this.hunger = hunger;
        this.inventory = inventory;
    }

    public void pickItem() {
        System.out.println("Pick Item");
    }

    @Override
    public String toString() {
        return "Playable{" +
                "hunger=" + hunger +
                ", inventory=" + Arrays.toString(inventory) +
                '}';
    }
}
