/**
 * Created by Magnus on 2017-04-14.
 */

public class Position {

    private int x;
    private int y;

    public Position (int x, int y) {

        this.x = x;
        this.y = y;
    }

    public int getX() {return x;}

    public int getY() {return y;}

    public Position getPosToSouth() {
        return new Position(x,y-1);

    }

    public Position getPosToNorth() {
        return new Position(x,y+1);

    }

    public Position getPosToWest() {
        return new Position(x-1,y);

    }

    public Position getPosToEast() {
        return new Position(x+1,y);

    }

    @Override
    public boolean equals (Object O) {

    }

    @Override
    public int hashCode() {

    }

}
