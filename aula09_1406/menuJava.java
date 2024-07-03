/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaI.aula09_1406;

import java.util.Scanner;

/**
 *
 * @author 22200545
 */
public class menuJava {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao, opcao2;
       
        int numConta;
        do {
            Banco nova = new Banco();
            System.out.println("\n***Banco Java***");
            System.out.println("1 - Criar uma nova conta");
            System.out.println("2 - Movimentar conta");
            System.out.println("3 - Listar Contas");
            System.out.println("4 - SAIR");
            opcao = Integer.parseInt(scan.nextLine());

            if (opcao == 1) {
                System.out.print("\nDigite o nome do cliente: ");
                nova.nome = scan.nextLine();
                System.out.print("Digite o valor de deposito inicial R$");
                nova.saldo = Double.parseDouble(scan.nextLine().replace(",", "."));
                System.out.print("Conta: ");
                nova.numeroConta();

                Banco.lista.add(nova);
            }

            if (opcao == 2) {
                if (Banco.lista.isEmpty()) {
                    System.out.println("Não existe conta cadastrada");
                } else {
                    System.out.println("Digite a conta que deseja movimentar: ");
                    int cont = Integer.parseInt(scan.nextLine());
                    do {

                        System.out.println("1 - Sacar");
                        System.out.println("2 - Depositar");
                        System.out.println("3 - Mostrar Saldo");
                        System.out.println("4 - Sair");
                        System.out.println("Digite a opcao que deseja");
                        opcao2 = Integer.parseInt(scan.nextLine());

                        if (opcao2 == 1) {
                            for (Banco index : Banco.lista) {
                                if (cont == index.numero) {
                                    System.out.print("Quanto deseja sacar ? R$");
                                    double quant = Double.parseDouble(scan.nextLine());
                                    nova.saque(quant);
                                }
                            }
                        }

                        if (opcao2 == 2) {
                            for (Banco index : Banco.lista) {
                                if (cont == index.numero) {
                                    double deposit;
                                    System.out.println("Quanto deseja depositar");
                                    deposit = Double.parseDouble(scan.nextLine());
                                    nova.deposita(deposit);
                                }
                            }
                        }

                        if (opcao2 == 3) {
                            for (Banco index : Banco.lista) {
                                if (cont == index.numero) {
                                    index.exibir();
                                }
                            }
                        }

                    } while (opcao2 != 4);

                }
            }

            if (opcao == 3) {
                System.out.println("Lista de contas");
                if (Banco.lista.isEmpty()) {
                    System.out.println("NÃO CONTEM CONTAS ");
                } else {
                    for (Banco index : Banco.lista) {
                        System.out.println("Nome: " + index.nome);
                        System.out.println("Numero da conta: " + index.numero);
                        System.out.println("Saldo " + index.saldo);
                        System.out.println("Disponivel para saque ? " + index.sacar);
                    }
                }
            }

        } while (opcao != 4);

    }
}
