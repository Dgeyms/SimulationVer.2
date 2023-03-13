public class Simulation {
    //private final List<Action> initAction;
    //private final List<Action> turnAction;
    private InitParametersEntity initParametersEntity;
    private ParameterMap parameterMap;

    public Simulation(InitParametersEntity initParametersEntity, ParameterMap parameterMap) {
        this.initParametersEntity = initParametersEntity;
        this.parameterMap = parameterMap;
    }

    public void startSimulation(InitParametersEntity initParametersEntity){

        RandomGameMap randomGameMap = new RandomGameMap(parameterMap);

        randomGameMap.generateCoordinatesObject(initParametersEntity.getPredatorCount(), "\uD83D\uDC2F");
        randomGameMap.generateCoordinatesObject(initParametersEntity.getHerbivoreCount(), "\uD83D\uDC11");
        randomGameMap.generateCoordinatesObject(initParametersEntity.getGrassCount(), "\uD83C\uDF31");
        randomGameMap.generateCoordinatesObject(initParametersEntity.getRockCount(), "\uD83D\uDC1A");
        randomGameMap.generateCoordinatesObject(initParametersEntity.getTreeCount(), "\uD83C\uDF32");

        randomGameMap.sizeMapStartPositions(); // число объектов в игре

        PrintGameMap printGameMap = new PrintGameMap(parameterMap, randomGameMap);
        printGameMap.startPrintGameMap();

    }
}
