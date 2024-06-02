/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaI.aula04_1503;

import java.util.Scanner;

/**
 *
 * @author 22200545
 */
public class array {
    public static void main(String[] args) {
        Scanner lerNum = new Scanner(System.in);

        int[] listNum = new int[20];
        
        for(int i = 0; i < 20; i++){
            //Atribuindo valores ao array
            System.out.print("Digite um numero ["+(i+1) +"]");
            listNum[i] = lerNum.nextInt();
        }
      
        System.out.println("Voce digitou os seguintes numeros");
        for (int i = 0; i < listNum.length; i++) {
            // Mostrando os valores
            System.out.print(listNum[i]);
        }
    }
}
