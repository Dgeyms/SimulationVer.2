import entity.Coordinates;

public class PrintGameMap {
    private final ParameterMap parameterMap;
    private RandomGameMap randomGameMap;

    public PrintGameMap(ParameterMap parameterMap, RandomGameMap randomGameMap) {
        this.parameterMap = parameterMap;
        this.randomGameMap = randomGameMap;
    }

    public void startPrintGameMap(){

        for (int y = 0; y < parameterMap.getY(); y++) {
            for (int x = 0; x < parameterMap.getX(); x++) {
                if(isPositionEmpty(x, y)){
                    System.out.print(randomGameMap.mapStartPositionsEntity.get(new Coordinates(x, y)) + "\t");
                }else {
                    System.out.print("|" + "\t");
                }
            }
            System.out.println("");
        }
    }
    private boolean isPositionEmpty(int x, int y){
        return randomGameMap.mapStartPositionsEntity.containsKey(new Coordinates(x, y));
    }
}
