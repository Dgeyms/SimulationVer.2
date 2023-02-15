public class RandomCoordinates {

    public static Coordinates randomCoordinate(SizeGameMap sgm){
        int coordinatesX = (int) (Math.random() * sgm.getX());
        int coordinatesY = (int) (Math.random() * sgm.getY());
            return new Coordinates(coordinatesX, coordinatesY);
    }
}
