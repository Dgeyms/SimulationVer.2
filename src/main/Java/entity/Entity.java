package entity;

public abstract class Entity {
    public Coordinates coordinates;
    final private String name;

    public Entity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
