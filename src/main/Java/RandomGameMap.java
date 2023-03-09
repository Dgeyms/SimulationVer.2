import entity.Coordinates;
import java.util.HashMap;

public class RandomGameMap {
    private InitParametersEntity initParametersEntity;
    private ParameterMap parameterMap;
    Coordinates coordinates;
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

    // закончил тут
    // переделать для всех объектов
}
