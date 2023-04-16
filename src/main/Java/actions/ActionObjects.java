package actions;

import bfs.BFS;
import entity.Coordinates;
import entity.Grass;
import entity.Herbivore;
import entity.Predator;
import map.RandomGameMap;
import map.WordMap;
import parametrs.ParameterMap;

import java.util.Set;

/*
* Активные действия игрового мира
 */
public class ActionObjects {
    Herbivore herbivore = new Herbivore();
    Predator predator = new Predator();
    Grass grass = new Grass();
    BFS bfs = new BFS();
    WordMap wordMap = new WordMap();



    public ActionObjects() {
    }

    public void startSimulation(){

        //System.out.println("Размер getObjectMap():" + randomGameMap.mapStartPositionsEntity.size());

        System.out.println("Размер getObjectMap():" +  wordMap.getMapWorld().size());
      //randomGameMap.sizeMapStartPositions();
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
    private Coordinates calculateNewHerbivorePosition(Coordinates herbivoreCoords, Coordinates grassCoords){

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
