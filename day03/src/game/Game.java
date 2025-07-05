package game;

public class Game {
    public static void main(String[] args) {
        Actor actor = new Actor("toyo",100.0);
        Mech mc = new Mech(1000.0);
        System.out.println(mc);
        mc.work();
    }
}
