import entity.Coordinates;
import map.RandomGameMap;
import map.WordMap;
import parametrs.ParameterMap;

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
                    System.out.print(randomGameMap.getRandomGameMap().get(new Coordinates(x, y)) + "\t");
                }else {
                    System.out.print("|" + "\t");
                }
            }
            System.out.println("");
        }
    }
    private boolean isPositionEmpty(int x, int y){
        return randomGameMap.getRandomGameMap().containsKey(new Coordinates(x, y));
    }
}
