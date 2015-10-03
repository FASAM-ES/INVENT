package br.edu.fasam.figurasgeometricasapp;

/**
 *
 * @author carlos
 */
public class Retangulo {
    Integer base;
    Integer altura;

    public Integer getBase() {
        return base;
    }

    public void setBase(Integer base) {
        this.base = base;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }
    
    public int CalcularArea(int base, int altura)
    {
        return base*altura;
    }
    
    public int CalcularPerimetro(int base, int altura)
    {
        return 2*(base+altura);
    }
}
