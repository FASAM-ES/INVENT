package br.edu.fasam.figurasgeometricasapp;

/**
 *
 * @author FabioCabral
 */

public class Quadrado
{

	public Quadrado(Integer lado)
	{
            setLado(lado);
	}


	private Integer area;
	private Integer _lado;

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


	public double getArea()
	{
            return Math.pow(_lado,2);
	}



}