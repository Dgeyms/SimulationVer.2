import actions.ActionObjects;
import map.RandomGameMap;
import map.WordMap;
import parametrs.InitParametersEntity;
import print.ParameterMap;

/*
 * Главный класс приложения
 */
public class Main {
    public static void main(String[] args) {

        ParameterMap parameterMap = new ParameterMap(20, 20);

        InitParametersEntity initParametersEntity = new InitParametersEntity();
        initParametersEntity.setGrassCount(16);
        initParametersEntity.setHerbivoreCount(6);
        initParametersEntity.setPredatorCount(10);
        initParametersEntity.setRockCount(5);
        initParametersEntity.setTreeCount(8);

        PlacementObjects placementObjects = new PlacementObjects(initParametersEntity, parameterMap);
        System.out.println("------Start simulation------");
        RandomGameMap randomGameMap = placementObjects.placementOfObjects(); // генерация игрового мира

        randomGameMap.sizeMapStartPositions(); // число объектов в игре

        // Распечатка игрового поля с сгенерированными объектами
        PrintGameMap printGameMap = new PrintGameMap(parameterMap, randomGameMap);
        printGameMap.startPrintGameMap();

        // Активные действия игрового мира
        WordMap wordMap = new WordMap(randomGameMap);
        ActionObjects actionObjects = new ActionObjects(wordMap);
        actionObjects.startSimulation();

        System.out.println("------End simulation------");


    }

}
