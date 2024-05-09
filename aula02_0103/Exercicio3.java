/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02_0103;

/**
 *
 * @author 22200545
 */
public class Exercicio3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabuada do: " + i);
            for (int j = 1; j <= 10; j++) {
                int tabuada = i * j;
                System.out.println(i + "x" + j + "=" + tabuada);
            }
        }
    }
}
