/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10_2106;

/**
 *
 * @author 22200545
 */


public class Ponto3D extends Ponto{ //extends Pont
    int z;

    public Ponto3D(int z, int x, int y) {
        super(x, y);    //usa construtor da classe pai Ponto, sempre que usar a filho cria extends da anterior
        this.z = z;     // seta o que é especifico da classe Ponto3D
    }

}
