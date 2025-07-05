package game;

public class Enemy {
    String loot;

    public Enemy() {
    }

    public Enemy(String loot) {
        this.loot = loot;
    }
//
//    public void() {
//        return loot;
//    }

    @Override
    public String toString() {
        return "Enemy{" +
                "loot='" + loot + '\'' +
                '}';
    }
}
