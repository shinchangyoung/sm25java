package game;

public class Actor extends ObjectInGame {
    protected String actor_ID;
    protected double speed;

    public Actor() {}

    public Actor(String actor_ID, double speed) {
        this.actor_ID = actor_ID;
        this.speed = speed;
    }

    @Override
    public void gone() {
        System.out.println("사용자가 게임에 접속");
    }

    @Override
    public String toString() {
        return "Actor{" +
                "actor_ID='" + actor_ID + '\'' +
                ", speed=" + speed +
                '}';
    }

    public void walk(){}
    public void stop(){}
    public void attack(){}
    public void guard(){}

}
