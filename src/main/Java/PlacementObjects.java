import entity.*;

public class PlacementObjects {
    private InitParametersEntity initParametersEntity;
    private final ParameterMap parameterMap;
    private final Grass grass;
    private final Predator predator;
    private final Hervibore hervibore;
    private final Rock rock;
    private final Tree tree;


    public PlacementObjects(InitParametersEntity initParametersEntity, ParameterMap parameterMap) {
        this.initParametersEntity = initParametersEntity;
        this.parameterMap = parameterMap;
        this.predator = new Predator();
        this.grass = new Grass();
        this.hervibore = new Hervibore();
        this.rock = new Rock();
        this.tree = new Tree();
    }

    public void placementOfObjects(InitParametersEntity initParametersEntity){
        RandomGameMap randomGameMap = new RandomGameMap(parameterMap);

        randomGameMap.generateCoordinatesObject(initParametersEntity.getPredatorCount(), predator.getName());
        randomGameMap.generateCoordinatesObject(initParametersEntity.getHerbivoreCount(), hervibore.getName());
        randomGameMap.generateCoordinatesObject(initParametersEntity.getGrassCount(), grass.getName());
        randomGameMap.generateCoordinatesObject(initParametersEntity.getRockCount(), rock.getName());
        randomGameMap.generateCoordinatesObject(initParametersEntity.getTreeCount(), tree.getName());

        randomGameMap.sizeMapStartPositions(); // число объектов в игре

        // Распечатка игрового поля с сгенерированными объектами
        PrintGameMap printGameMap = new PrintGameMap(parameterMap, randomGameMap);
        printGameMap.startPrintGameMap();
    }
}
