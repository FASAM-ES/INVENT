public class BolaQuadrada
{
    public BolaQuadrada(int side)
    {
        setSide(side);
    }
    private final int _side;
	public BolaQuadrada(int side)
	{
		this._side = side;
	}
	
       public Integer GetArea()
       {
           return getSide() * 4;
       }

    private int getSide() {
        return _side;
    }

    public void setSide(int side) {
        _side = side;
    }
	}