/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospital_actividad_1;

/**
 *
 * @author Propia
 */
public class Persona {
    
    private double peso;
    private double estatura;
    
    public double getPeso(){
        return peso;
    }
    public void setPeso(double p){
        this.peso = p;
    }
    
    public double getEstatuta(){
        return estatura;
    }
    public void setEstatura(double e){
        this.estatura = e;
    }
    
    public double calcularIMC(){
        double imc = this.getPeso()/Math.pow(this.getEstatuta(),2);
        return imc;
    }
    
}
