/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasam.figurasgeometricasapp;

/**
 *
 * @author leandro khalil
 */
public class TrianguloKhalil {
    private Integer _area;
    private Integer _perimetro;
    
    private Integer _lado1;
    private Integer _lado3;
    private Integer _lado2;
    
    public TrianguloKhalil(Integer lado1, Integer lado2, Integer lado3)
    {
        _lado1 = lado1;
        _lado2 = lado2;
        _lado3 = lado3;
    }

    public Integer getArea() {
        return _area;
    }

    public double getPerimetro() {
        return (_lado1 + _lado2 + _lado3) / 2;
    }
    
    public double calulaArea() {
        double p = getPerimetro();
        
        double area = p * (p - _lado1) * (p - _lado2) * (p - _lado3); 
        
        //return Math.sqrt(area);
        
        return Math.round(Math.sqrt(area) * 1000.00) / 1000.00;
    }
}
