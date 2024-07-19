/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaI.aula10_2106;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marci
 */
public class Matricial extends Impressora {
    private int numAgulhas;
    private boolean imprimeVias;
    public static List<Matricial> matriciais = new ArrayList();

    public Matricial(int numAgulhas, boolean imprimeVias, String marca, String modelo, boolean colorida, double peso) {
        super(marca, modelo, colorida, peso);
        this.numAgulhas = numAgulhas;
        this.imprimeVias = imprimeVias;
    }

    public Matricial() {
    }

    public int getNumAgulhas() {
        return numAgulhas;
    }

    public void setNumAgulhas(int numAgulhas) {
        this.numAgulhas = numAgulhas;
    }

    public boolean isImprimeVias() {
        return imprimeVias;
    }

    public void setImprimeVias(boolean imprimeVias) {
        this.imprimeVias = imprimeVias;
    }

    static class matriciais {

        public matriciais() {
        }
    }
    
    
    
}
