package entity;

public abstract class Creature extends Entity {
    private int speed;
    private int HP;

    public Creature() {
    super("P");
    }

    abstract void makeMove();
}
