public class Triangulo
{
	public Triangulo(int base, int altura)
	{
		_base = base;
		_altura = altura;
	}
	
	public decimal ObterArea()
	{
	   return _base * _altura / 2;
	}
	
	public decimal ObterPerimetro(int comprimentoLado1, int comprimentoLado2, int comprimentoLado3)
	{
	   return comprimentoLado1 + comprimentoLado2 + comprimentoLado3;
	}
}