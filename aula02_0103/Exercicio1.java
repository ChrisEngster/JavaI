/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaI.aula02_0103;

/**
 *
 * @author 22200545
 */
public class Exercicio1 {
    public static void main(String[] args) {
        double salario;
        int limiteCheque;
        
       salario = 1000;
       
        System.out.println("O seu salario é de: " + salario);
        
        if(salario > 5000 ){
            limiteCheque = 2000;
            System.out.println("O limite será de R$ 2.000,00");
        } else if (salario > 3000 && salario < 5000){
              limiteCheque = 1500;
            System.out.println("O seu limite será de R$ 1.500,00");    
        } else if (salario > 2000 && salario < 3000){
              limiteCheque = 1000;
            System.out.println("O seu limite será de R $1.000,00");
        } else if(salario > 1000 && salario < 2000){
              limiteCheque = 500;
            System.out.println("O seu limite será de R$ 500,00");
        } else {
              limiteCheque = 0;
            System.out.println("Você não tera limite!! ");
        }
     }
}

