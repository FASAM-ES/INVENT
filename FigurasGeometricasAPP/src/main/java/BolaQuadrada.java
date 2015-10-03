
public class BolaQuadrada {

    private int _side;

    public BolaQuadrada(int side) {
        setSide(side);
    }

    public Integer GetArea() {
        return getSide() * 4;
    }

    private int getSide() {
        return _side;
    }

    public void setSide(int side) {
        _side = side;
    }
}
