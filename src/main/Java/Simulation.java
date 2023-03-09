import java.util.List;

public class Simulation {
    //private final List<Action> initAction;
    //private final List<Action> turnAction;
    private InitParametersEntity initParametersEntity;
    private ParameterMap parameterMap;

    public void startSimulation(InitParametersEntity initParametersEntity){
        RandomGameMap randomGameMap = new RandomGameMap();
        randomGameMap.generateCoordinatesObject(initParametersEntity.getPredatorCount(), "P");
        randomGameMap.generateCoordinatesObject(initParametersEntity.getHerbivoreCount(), "H");
        randomGameMap.generateCoordinatesObject(initParametersEntity.getGrassCount(), "G");
        randomGameMap.generateCoordinatesObject(initParametersEntity.getRockCount(), "R");
        randomGameMap.generateCoordinatesObject(initParametersEntity.getTreeCount(), "T");

        WordMap wordMap = new WordMap();
        wordMap.startPositionsEntity(initParametersEntity);

    }
}
