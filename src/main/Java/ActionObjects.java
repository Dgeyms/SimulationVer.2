import entity.Grass;

/*
* Активные действия игрового мира
 */
public class ActionObjects {
    private Grass grass;

    public void startSimulation(){
        int moveNumber = 1;

        while (true){
            System.out.println("Number of cycles:" + moveNumber);
            WordMap wordMap = new WordMap();
            wordMap.searchForType(grass.getName());

        }

    }

}
