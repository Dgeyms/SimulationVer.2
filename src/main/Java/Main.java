import actions.ActionObjects;
import parametrs.InitParametersEntity;
import parametrs.ParameterMap;

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
        placementObjects.placementOfObjects(initParametersEntity); // генерация игрового мира


        ActionObjects actionObjects = new ActionObjects();
        actionObjects.startSimulation();


        System.out.println("------End simulation------");


    }

}
