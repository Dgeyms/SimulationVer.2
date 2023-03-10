import entity.Coordinates;
import java.util.HashMap;

public class RandomGameMap {
    private final ParameterMap parameterMap;

    public RandomGameMap(ParameterMap parameterMap) {
        this.parameterMap = parameterMap;
    }

    HashMap<Coordinates, String> mapStartPositionsEntity = new HashMap<>();


    public Coordinates randomCoordinates(){
        int X = (int) (Math.random() * parameterMap.getX());
        int Y = (int) (Math.random() * parameterMap.getY());
        return (new Coordinates(X, Y));
    }
    public void generateCoordinatesObject(int x, String name) {
        for (int i = 0; i < x; i++) {
            Coordinates coordinatesObject;
            do {
                coordinatesObject = randomCoordinates();
            } while (mapStartPositionsEntity.containsKey(coordinatesObject) || isOutOfBounds(coordinatesObject));
            mapStartPositionsEntity.put(coordinatesObject, name);
        }
    }
    private boolean isOutOfBounds(Coordinates coordinates) {
        return coordinates.getX() >= parameterMap.getX() || coordinates.getY() >= parameterMap.getY();
    }
    public void sizeMapStartPositions(){
        System.out.println("Число объектов: " + mapStartPositionsEntity.size());
    }

    // закончил тут
    // переделать для всех объектов
}
