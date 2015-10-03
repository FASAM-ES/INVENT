public class Triangulo
{
	Integer _base;
	Integer _altura;
	public Triangulo(Integer base, Integer altura)
	{
		_base = base;
		_altura = altura;
	}
	
	public Integer ObterArea()
	{
	   return _base * _altura / 2;
	}
	
	public Integer ObterPerimetro(int comprimentoLado1, int comprimentoLado2, int comprimentoLado3)
	{
	   return comprimentoLado1 + comprimentoLado2 + comprimentoLado3;
	}
}