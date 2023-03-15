/*
 * Главный класс приложения
 */
public class Main {
    public static void main(String[] args) {

        ParameterMap parameterMap = new ParameterMap(20, 20);

        InitParametersEntity initParametersEntity = new InitParametersEntity();
        initParametersEntity.setGrassCount(15);
        initParametersEntity.setHerbivoreCount(6);
        initParametersEntity.setPredatorCount(10);
        initParametersEntity.setRockCount(5);
        initParametersEntity.setTreeCount(8);

        PlacementObjects placementObjects = new PlacementObjects(initParametersEntity, parameterMap);
        System.out.println("------Start simulation------");
        placementObjects.placementOfObjects(initParametersEntity);

        ActionObjects actionObjects = new ActionObjects();
        actionObjects.startSimulation();

        System.out.println("------End simulation------");


    }

}
