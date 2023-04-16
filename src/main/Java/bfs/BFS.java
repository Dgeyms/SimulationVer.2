package bfs;

import entity.Coordinates;
import map.WordMap;

import java.util.*;

/*
* поиск по ширине
 */
public class BFS {
    private WordMap wordMap;

    public BFS() {
    }

    public BFS(WordMap wordMap) {
        this.wordMap = wordMap;
    }

    public Coordinates searchForType(Coordinates currentPosition, String desiredObject) {

// Инициализируйте поиск в ширину с текущей позиции травоядного
        //создаем очередь queue типа LinkedList для обхода в ширину, которая будет содержать координаты клеток.
        Queue<Coordinates> queue = new LinkedList<>();
        // создаем множество visited, которое будет содержать координаты клеток, которые уже были посещены.
        Set<Coordinates> visited = new HashSet<>();
        //создаем словарь parentMap, который будет содержать отображение между каждой посещенной клеткой и ее "родителем"
        //в процессе обхода в ширину (т.е. предыдущей клеткой, из которой мы пришли).
        Map<Coordinates, Coordinates> parentMap = new HashMap<>();

        queue.offer(currentPosition); // добавляем стартовую координату в очередь queue.
        visited.add(currentPosition); // добавляем стартовую координату в множество visited.
        parentMap.put(currentPosition, null); //устанавливаем для стартовой координаты значение null в словаре parentMap, т.к. это корневой узел, от которого мы начинаем поиск.

// Найденная координата травы
        Coordinates grassCoordinate = null; // объявление и инициализация переменной grassCoordinate, которая будет хранить координаты травы.

// Поиск ближайшей координаты травы
        while (!queue.isEmpty()) {
            Coordinates current = queue.poll(); // извлекаем элемент из очереди

            // Если найдена координата травы, выйти из цикла
            if (wordMap.getMapWorld().get(current).equals(desiredObject)) {
                grassCoordinate = current;
                break;
            }
// Этот цикл перебирает всех соседей текущей позиции current в wordMap и добавляет их в очередь для дальнейшего поиска.
            for (Coordinates next : getNeighbors(current)) {
                if (!visited.contains(next) && wordMap.getMapWorld().containsKey(next)) {
                    visited.add(next);
                    parentMap.put(next, current);
                    queue.offer(next);
                }
            }
        }
        return grassCoordinate;
    }
    private List<Coordinates> getNeighbors(Coordinates current) {
        List<Coordinates> neighbors = new ArrayList<>();
        int x = current.getX();
        int y = current.getY();

        // Добавляем всех соседей текущей координаты в список neighbors
        neighbors.add(new Coordinates(x - 1, y)); // слева
        neighbors.add(new Coordinates(x + 1, y)); // справа
        neighbors.add(new Coordinates(x, y - 1)); // сверху
        neighbors.add(new Coordinates(x, y + 1)); // снизу

        return neighbors;
    }
}
