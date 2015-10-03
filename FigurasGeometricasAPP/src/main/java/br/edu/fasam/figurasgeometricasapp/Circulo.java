
package br.edu.fasam.figurasgeometricasapp;

/**
 * @author herlan
 */
public class Circulo 
{
    private double Area;
    private double Raio = 10;
    private double Pi = 3.1456;
    
    public double CalcularArea(double raio, double pi)
    {          
        Area = raio * raio * pi;
        
        return Area;
    }
    
}
