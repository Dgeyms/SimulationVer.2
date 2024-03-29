package entity;

import java.util.Objects;

public class Coordinates {
    private  int X;
    private  int Y;

    public Coordinates(int x, int y) {
        X = x;
        Y = y;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    public int setX(int x) {
        X = x;
        return x;
    }

    public int setY(int y) {
        Y = y;
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinates that = (Coordinates) o;
        return X == that.X && Y == that.Y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(X, Y);
    }


}
