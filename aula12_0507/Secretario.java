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
public class Secretario extends Empregado {
     public static void main(String[] args) {
        Secretario sec = new Secretario();
        sec.setSalario(22, 10.00);
        System.out.println(sec.getSalario());

    }
}
