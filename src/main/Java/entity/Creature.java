package entity;

public abstract class Creature extends Entity {
    private int speed;
    private int HP;

    public Creature(String name) {
        super(name);
    }

    abstract void makeMove();
}
