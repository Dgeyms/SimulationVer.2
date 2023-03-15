import entity.Coordinates;
import entity.Entity;

import java.util.*;

/*
* Игровое поле
 */
public class WordMap {
    Coordinates coordinates;
    Entity entity;
    RandomGameMap randomGameMap = new RandomGameMap();
    HashMap<Coordinates, String> objectMap = new HashMap<>(randomGameMap.mapStartPositionsEntity);


    public ArrayList<Coordinates> searchForType(String name) {

        ArrayList<Coordinates> result = new ArrayList<>();
        HashSet<Coordinates> visited = new HashSet<>();
        Queue<Coordinates> queue = new LinkedList<>();

// Это цикл, который проходит по всем ключам (координатам) в объектной карте (objectMap).
        for (Coordinates c : objectMap.keySet()) {
            if (objectMap.get(c).equals(name)) { //Это условие, которое проверяет, является ли тип объекта (objectMap.get(c)) равным заданному типу (type).
                visited.add(c); // Это добавление текущей координаты (c) в множество посещенных (visited).
                queue.add(c); // Это добавление текущей координаты (c) в очередь (queue).
            }
        }
// Это цикл, который будет выполняться, пока очередь (queue) не пуста. Внутри цикла будет выполняться поиск объектов.
        while (!queue.isEmpty()) {
            Coordinates current = queue.poll(); // Это получение первой координаты из очереди (queue) и удаление ее из очереди.
            result.add(current);

            int x = current.getX();
            int y = current.getY();

            Coordinates up = new Coordinates(x, y-1);
            Coordinates down = new Coordinates(x, y+1);
            Coordinates left = new Coordinates(x-1, y);
            Coordinates right = new Coordinates(x+1, y);

            for (Coordinates next : Arrays.asList(up, down, left, right)) {
                if (!visited.contains(next) && objectMap.containsKey(next) && objectMap.get(next).equals(name)) {
                    visited.add(next);
                    queue.add(next);
                }
            }
        }

        return result;
    }

}

