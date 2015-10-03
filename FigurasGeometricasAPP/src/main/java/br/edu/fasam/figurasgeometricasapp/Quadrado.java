package br.edu.fasam.figurasgeometricasapp;

public class Quadrado
{
	private Double area;
	private Integer _lado;

        public  Quadrado(Integer lado)
	{
            setLado(lado);
	}

	public Integer getLado()
	{
		return _lado;
	}

	public void setLado(Integer lado) 
	{
		this._lado = lado;
	}

	
	public Integer getPerimetro()
	{
		return _lado * 4;
	}	


	public Double getArea()
	{
		return Math.pow(_lado,2);
	}



}