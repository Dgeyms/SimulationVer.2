package actions;

import bfs.BFS;
import entity.Coordinates;
import entity.Grass;
import entity.Herbivore;
import entity.Predator;
import map.RandomGameMap;
import map.WordMap;

import java.util.Set;

/*
 * Активные действия игрового мира
 */
public class ActionObjects {
    private WordMap wordMap;
    Herbivore herbivore = new Herbivore();
    Predator predator = new Predator();
    Grass grass = new Grass();
    BFS bfs = new BFS();

    public ActionObjects(WordMap wordMap) {
        this.wordMap = wordMap;
    }

    public ActionObjects() {
    }

    public void startSimulation() {
        wordMap.addRandomInMap();
        wordMap.sizeMapWorld();

      int moveNumber = 1;

        while (moveNumber < 10){
            System.out.println("Number of cycles:" + moveNumber);
            // Список всех травоядных
            Set<Coordinates> listHerbivore = wordMap.getKeysByValue(herbivore.getName());
            for (Coordinates herbivoreCoords : listHerbivore){
                Coordinates grassCoords = bfs.searchForType(herbivoreCoords, grass.getName()); // ищем траву

               Coordinates newHerbivorePosition = calculateNewHerbivorePosition(herbivoreCoords, grassCoords);
               wordMap.getMapWorld().put(newHerbivorePosition, herbivore.getName());

            }
            moveNumber++;
        }
    }

    //-----------------private---------------
    // Определяем в каком направлении двигаться
    private Coordinates calculateNewHerbivorePosition(Coordinates herbivoreCoords, Coordinates grassCoords) {

        int herbivoreX = herbivoreCoords.getX();
        int herbivoreY = herbivoreCoords.getY();
        int grassX = grassCoords.getX();
        int grassY = grassCoords.getY();

        int newX = herbivoreX;
        int newY = herbivoreY;

        if (herbivoreX < grassX) {
            newX = herbivoreX + 1;
        } else if (herbivoreX > grassX) {
            newX = herbivoreX - 1;
        }

        if (herbivoreY < grassY) {
            newY = herbivoreY + 1;
        } else if (herbivoreY > grassY) {
            newY = herbivoreY - 1;
        }

        return new Coordinates(newX, newY);
    }

}
