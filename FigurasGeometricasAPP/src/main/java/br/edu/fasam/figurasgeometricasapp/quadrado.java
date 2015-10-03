package br.edu.fasam.figurasgeometricasapp;

/**
 *
 * @author FabioCabral
 */

public class Quandrado
{

	public  Quandrado(Integer lado)
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


	public Integer getArea()
	{
		return Math.pow(_lado,2);
	}



}