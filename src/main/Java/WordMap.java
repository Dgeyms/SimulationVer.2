import entity.Coordinates;
import entity.Entity;

import java.util.HashMap;

/*
* Игровое поле
 */
public class WordMap {
    Coordinates coordinates;
    Entity entity;
    HashMap<Coordinates, Entity> wordMap = new HashMap<>();

    public void setObject(Coordinates coordinates, Entity entity){
        entity.coordinates = coordinates; // Внутри объекта будем обновлять координаты
        wordMap.put(coordinates, entity);
    }
 // Стартовая позиция объектов
    public void startPositionsEntity(InitParametersEntity initParametersEntity){


    }
}
