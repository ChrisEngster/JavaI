/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10_2106;

/**
 *
 * @author marci
 */
public class Impressora {
    private String marca;
    private String modelo;
    private boolean colorida;
    private double peso;

    public Impressora(String marca, String modelo, boolean colorida, double peso) {
        this.marca = marca;
        this.modelo = modelo;
        this.colorida = colorida;
        this.peso = peso;
    }

    public Impressora() {
    }
    
    

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isColorida() {
        return colorida;
    }

    public void setColorida(boolean colorida) {
        this.colorida = colorida;
    }
    
}