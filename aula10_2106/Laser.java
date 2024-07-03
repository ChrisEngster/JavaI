/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10_2106;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marci
 */
public class Laser extends Impressora {
    double capacidadeToner;
    boolean frenteVerso;
    public static List<Laser> lasers = new ArrayList();

    public Laser(double capacidadeToner, boolean frenteVerso, String marca, String modelo, boolean colorida, double peso) {
        super(marca, modelo, colorida, peso);
        this.capacidadeToner = capacidadeToner;
        this.frenteVerso = frenteVerso;
    }

    public Laser() {
    }

    public double getCapacidadeToner() {
        return capacidadeToner;
    }

    public void setCapacidadeToner(double capacidadeToner) {
        this.capacidadeToner = capacidadeToner;
    }

    public boolean isFrenteVerso() {
        return frenteVerso;
    }

    public void setFrenteVerso(boolean frenteVerso) {
        this.frenteVerso = frenteVerso;
    }
    
    
}