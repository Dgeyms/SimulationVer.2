package parametrs;

public class InitParametersEntity {
    private int predatorCount;
    private int herbivoreCount;
    private int treeCount;
    private int rockCount;
    private int grassCount;

    public InitParametersEntity() {
        this.predatorCount = predatorCount;
        this.herbivoreCount = herbivoreCount;
        this.treeCount = treeCount;
        this.rockCount = rockCount;
        this.grassCount = grassCount;
    }

    public int getPredatorCount() {
        return predatorCount;
    }

    public int getHerbivoreCount() {
        return herbivoreCount;
    }

    public int getTreeCount() {
        return treeCount;
    }

    public int getRockCount() {
        return rockCount;
    }

    public int getGrassCount() {
        return grassCount;
    }

    public void setPredatorCount(int predatorCount) {
        this.predatorCount = predatorCount;
    }

    public void setHerbivoreCount(int herbivoreCount) {
        this.herbivoreCount = herbivoreCount;
    }

    public void setTreeCount(int treeCount) {
        this.treeCount = treeCount;
    }

    public void setRockCount(int rockCount) {
        this.rockCount = rockCount;
    }

    public void setGrassCount(int grassCount) {
        this.grassCount = grassCount;
    }
}
