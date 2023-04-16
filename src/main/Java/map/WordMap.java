package map;

import actions.ActionObjects;
import entity.Coordinates;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
* Игровое поле
 */
public class WordMap {
    private final HashMap<Coordinates, String> mapWorld = new HashMap<>();



    public HashMap<Coordinates, String> getMapWorld() {
        return mapWorld;
    }

    public WordMap() {
    }


    // Set всех объектов в HashMap
    public Set<Coordinates> getKeysByValue(String value){
        Set<Coordinates> keys = new HashSet<>();
        for(Map.Entry<Coordinates, String> entry : mapWorld.entrySet() ){
            if (entry.getValue().equals(value)) {
                keys.add(entry.getKey());
            }
        }
        return  keys;
    }
}

