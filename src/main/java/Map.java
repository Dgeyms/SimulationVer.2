import javax.swing.text.html.parser.Entity;
import java.util.HashMap;

public class Map {
    HashMap<Coordinates, Entity> map = new HashMap<>();

    public void addEntityBoard(Coordinates coordinates, Entity entity){
        map.put(coordinates, entity);
    }

        // Рандом координат объектов
    public void putOnRandomCoordinate(Entity entity){
        Coordinates coordinates =
    }
}
