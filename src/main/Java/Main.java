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

        Simulation simulation = new Simulation(initParametersEntity, parameterMap);
        System.out.println("------Start simulation------");
        simulation.startSimulation(initParametersEntity);
        System.out.println("------End simulation------");

    }
    // План
    // Расставить объекты на карте
    //     Сгенерировать координаты объектов
    //     Я застрял на том что надо добавить сгенерированные объекты в HashMap
}
