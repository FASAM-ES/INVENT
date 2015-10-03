package br.edu.fasam.figurasgeometricasapp;

/**
 *
 * @author FabioCabral
 */

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

	
	public int getPerimetro()
	{
            return _lado * 4;
	}	


	public double getArea()
	{
            return Math.pow(_lado,2);
	}


}