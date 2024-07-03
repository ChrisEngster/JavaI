/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaI.aula08_0706;

import java.util.Scanner;

/**
 *
 * @author 22200545
 */
public class Banco {
    public static void main(String[] args) {
        int opcao = 0;
        Scanner scan = new Scanner(System.in);
        Conta nova = new Conta();
        
        
        do {            
            
            System.out.println(" 1 - abrir a conta");
            System.out.println(" 2 - sacar");
            System.out.println(" 3 - ver saldo");
            System.out.println(" 4 - depositar");
            opcao = Integer.parseInt(scan.nextLine());
            
            if(opcao == 1){
               
                System.out.println("---Criando conta---");
                System.out.println("Digite seu nome: ");
                nova.nome = scan.nextLine();
                System.out.println("Digite o numero da conta: ");
                nova.numero = Double.parseDouble(scan.nextLine().replace(",", "."));
                System.out.println("Digite o saldo inicial da conta: ");
                nova.saldo = Double.parseDouble(scan.nextLine().replace(",", "."));
                System.out.println("Digite o limite: ");
                nova.limite = Double.parseDouble(scan.nextLine().replace(",", "."));
                
                Conta.lista.add(nova);
            }
            if (opcao == 2) {
                    System.out.println("Quanto deseja sacar ?");
                    double i = 0;
                    i = Double.parseDouble(scan.nextLine());
                    nova.sacar(i);

            }
            
            if (opcao == 3) {
                System.out.println("Seu saldo atual é: ");
                nova.mostrarSaldo(nova.saldo);
            }
            
            if (opcao == 4) {
                System.out.println("Quanto você deseja depositar ? ");
                double deposit;
                deposit = Double.parseDouble(scan.nextLine());
                nova.depositar(deposit);
            } else{
                
            }
        } while (opcao != 5);
        
    }
}
