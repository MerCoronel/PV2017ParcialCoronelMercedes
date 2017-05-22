/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.form.bean;

import aplicacion.modelo.dominio.ArregloNumeros;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Severa
 */
@ManagedBean
@ViewScoped
public class NumeroFormBean implements Serializable{
private ArrayList<Integer> numeros;
private int numer;
private int menor=0;
    /**
     * Creates a new instance of NumeroFormBean
     */
    public NumeroFormBean() {
        numeros = new ArrayList<Integer>();
    }
    
    public void agregarNumero()
    {
        numeros.add(numer);
    }
    public String devolverNumeros()
    {
        if(numeros.isEmpty()) return "";
        String adevolver = "Numeros ingresados"; 
        for(int a : numeros)
        {
            adevolver = adevolver + "(" +a + ")";
        }
        return adevolver;
    }
    public String devolverCalculo()
    {
        if(numeros.isEmpty()) return "";
        String devuelto = "";
        menor = numeros.get(0); 
        double promedio = 0.0;
        for(int a:numeros) 
        {
            if(menor > a) menor = a;
            promedio = promedio+a;
        }
        devuelto = "Menor: (" + menor + ") - Promedio: (" + (promedio/numeros.size()) + ")";
        return devuelto;
    }
    public ArrayList<Integer> getNumeros() {
        return numeros;
    }

    public void setNumeros(ArrayList<Integer> numeros) {
        this.numeros = numeros;
    }

    public int getNumer() {
        return numer;
    }

    public void setNumer(int numer) {
        this.numer = numer;
    }

    public int getMenor() {
        return menor;
    }

    public void setMenor(int menor) {
        this.menor = menor;
    }
    
}