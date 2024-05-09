/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03_0803;

import java.util.Scanner;

/**
 *
 * @author 22200545
 */
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    
    
        System.out.print("Digite o numero que deseja ser feito a tabuada: ");
         int numero = scanner.nextInt();
        
        for (int i = 1; i < 10; i++) {
            int resultado = numero * i;
            System.out.println(resultado);
        }
   }
}
