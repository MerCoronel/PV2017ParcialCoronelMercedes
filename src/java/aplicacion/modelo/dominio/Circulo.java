/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 *
 * @author USUARIO
 */
public class Circulo implements Serializable {
    private double radio;
    private double superficie;
    private double diametro;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
        this.superficie = 3.14*(radio*radio);
        this.diametro = 3.14*(radio*radio);
    }

    /**
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * @return the superficie
     */
    public double getSuperficie() {
        return superficie;
    }

    /**
     * @param superficie the superficie to set
     */
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    /**
     * @return the diametro
     */
    public double getDiametro() {
        return diametro;
    }

    /**
     * @param diametro the diametro to set
     */
    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }
    
    
}
