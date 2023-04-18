package map;

import print.ParameterMap;
import entity.Coordinates;

import java.util.HashMap;

public class RandomGameMap {
    private ParameterMap parameterMap;

    private final HashMap<Coordinates, String> randomGameMap = new HashMap<>();

    public HashMap<Coordinates, String> getRandomGameMap() {
        return randomGameMap;
    }

    public RandomGameMap(ParameterMap parameterMap) {
        this.parameterMap = parameterMap;
    }

    public RandomGameMap() {
    }

    public Coordinates randomCoordinates() {
        int X = (int) (Math.random() * parameterMap.getX());
        int Y = (int) (Math.random() * parameterMap.getY());
        return (new Coordinates(X, Y));
    }

    public void generateCoordinatesObject(int x, String name) {
        for (int i = 0; i < x; i++) {
            Coordinates coordinatesObject;
            do {
                coordinatesObject = randomCoordinates();
            } while (randomGameMap.containsKey(coordinatesObject) || isOutOfBounds(coordinatesObject));
            randomGameMap.put(coordinatesObject, name);
        }
    }

    private boolean isOutOfBounds(Coordinates coordinates) {
        return coordinates.getX() >= parameterMap.getX() || coordinates.getY() >= parameterMap.getY();
    }

    public void sizeMapStartPositions() {
        System.out.println("Сгенерированно объектов: " + randomGameMap.size());
    }
}
