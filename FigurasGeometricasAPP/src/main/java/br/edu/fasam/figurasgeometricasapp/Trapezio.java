package br.edu.fasam.figurasgeometricasapp;

/**
 *
 * @author carlos
 */
public class Trapezio {
    
    TipoTrapezio tipoTrapezio;
    Integer baseMaior;
    Integer baseMenor;
    Integer altura;
    Integer lado1;
    Integer lado2;

    public TipoTrapezio getTipoTrapezio() {
        return tipoTrapezio;
    }

    public void setTipoTrapezio(TipoTrapezio tipoTrapezio) {
        this.tipoTrapezio = tipoTrapezio;
    }

    public Integer getBaseMaior() {
        return baseMaior;
    }

    public void setBaseMaior(Integer baseMaior) {
        this.baseMaior = baseMaior;
    }

    public Integer getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(Integer baseMenor) {
        this.baseMenor = baseMenor;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }
    
    public int CalcularArea()
    {
        return ((baseMaior+baseMenor)*altura)/2;
    }
    
    public TipoTrapezio GetTipoTrapezio(int lado1, int lado2)
    {
        TipoTrapezio tipoTrapezio = TipoTrapezio.Nenhum;
        
        if(lado1!=lado2)
            tipoTrapezio = TipoTrapezio.Escaleno;
        
        if(lado1 == lado2)
            tipoTrapezio = TipoTrapezio.Isoceles;
        
        return tipoTrapezio;
                
    }
 }

