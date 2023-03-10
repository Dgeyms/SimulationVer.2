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
        randomGameMap.generateCoordinatesObject(initParametersEntity.getPredatorCount(), "P");
        randomGameMap.generateCoordinatesObject(initParametersEntity.getHerbivoreCount(), "H");
        randomGameMap.generateCoordinatesObject(initParametersEntity.getGrassCount(), "G");
        randomGameMap.generateCoordinatesObject(initParametersEntity.getRockCount(), "R");
        randomGameMap.generateCoordinatesObject(initParametersEntity.getTreeCount(), "T");

        randomGameMap.sizeMapStartPositions(); // число объектов в игре



        //WordMap wordMap = new WordMap();
        //wordMap.startPositionsEntity(initParametersEntity);

    }
}
