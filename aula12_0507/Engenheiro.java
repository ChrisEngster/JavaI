/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaI.aula12_0507;

/**
 *
 * @author 22200545
 */
public class Engenheiro extends Empregado {
    public static void main(String args[]) {
        Engenheiro eng = new Engenheiro();
        eng.setSalario(22, 35.00);
        System.out.println(eng.getSalario());
    }
}
