package entity;

public abstract class Entity {
    public Coordinates coordinates;
    private String name;

    public Entity(String p) {
        this.coordinates = coordinates;
        this.name = name;
    }

    public Entity(Coordinates coordinates, String name) {
        this.coordinates = coordinates;
        this.name = name;
    }

    public String getName(String litter) {
        return name;
    }
}
