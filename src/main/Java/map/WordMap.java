package map;

import entity.Coordinates;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * Игровое поле
 */
public class WordMap {
    private final RandomGameMap randomGameMap;
    private final HashMap<Coordinates, String> mapWorld = new HashMap<>();

    public WordMap(RandomGameMap randomGameMap) {
        this.randomGameMap = randomGameMap;
    }

    public HashMap<Coordinates, String> getMapWorld() {
        return mapWorld;
    }

    // Добавляем рандомные объекты в mapWorld
    public void addRandomInMap() {
        for (Map.Entry<Coordinates, String> entry : randomGameMap.getRandomGameMap().entrySet()) {
            Coordinates key = entry.getKey();
            String value = entry.getValue();
            mapWorld.put(key, value);
        }
    }

    // Set всех объектов в HashMap
    public Set<Coordinates> getKeysByValue(String value) {
        Set<Coordinates> keys = new HashSet<>();
        for (Map.Entry<Coordinates, String> entry : mapWorld.entrySet()) {
            if (entry.getValue().equals(value)) {
                keys.add(entry.getKey());
            }
        }
        return keys;
    }
    // Число объектов в mapWorld
    public void sizeMapWorld(){
        System.out.println("Число объектов в mapWorld: " + mapWorld.size());
    }
}

