/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05_2203;

import java.util.Scanner;

/**
 *
 * @author 22200545
 */
public class Exercicio06 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String[][] agenda = new String[10][5];

        int opcao;
        int l = 0, c = 0;

        do {
            System.out.println("\nAgenda");
            System.out.println("1 - Cadastrar contato");
            System.out.println("2 - Listar Agenda!");
            System.out.println("3 - Sair!");
            System.out.print("Opcao: ");
            opcao = Integer.parseInt(ler.nextLine());

            if (opcao == 1) {
                System.out.println("Digite seu nome:");
                agenda[l][c] = ler.nextLine();
                c++;
                System.out.println("Digite seu endereço:");
                agenda[l][c] = ler.nextLine();
                c++;
                System.out.println("Digite sua cidade:");
                agenda[l][c] = ler.nextLine();
                c++;
                System.out.println("Digite seu telefone: ");
                agenda[l][c] = ler.nextLine();
                c++;
                System.out.println("Digite seu email: ");
                agenda[l][c] = ler.nextLine();
                l++;
                c = 0;
            }
            if (opcao == 2) {
                if(l == 0){
                    System.out.println("Nao existe cadastro!");
                } else {
                for (int i = 0; i < l ; i++) {
                            // esse i é para percorrer as linhas
                            System.out.println("Nome: " + agenda[i][0] + "\t");
                            System.out.println("endereco: " + agenda[i][1] + "\t");
                            System.out.println("cidade: " + agenda[i][2] + "\t");
                            System.out.println("telefone: " + agenda[i][3] + "\t");
                            System.out.println("email: " + agenda[i][4] + "\t");
                            System.out.println("-----------------------");
                        }
                    }
                }
        } while(opcao != 3);
    }
}
