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
public class testes {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String[][] jogadores = new String[10][6];

        int opcao;
        int l = 0, c = 0;
        int time = 0;
        
        do {
            System.out.println("1 - Cadastro de jogador");
            System.out.println("2 - Lista time do inter");
            System.out.println("3 - Lista time do gremio");
            System.out.println("4 - Lista todos os jogadores");
            System.out.println(" 5 - Sair");
            System.out.print("opcao: ");
            opcao = Integer.parseInt(ler.nextLine());

            if (opcao == 1) {
                System.out.println("Digite seu nome:");
                jogadores[l][c] = ler.nextLine();
                c++;
                System.out.println("Digite sua idade:");
                jogadores[l][c] = ler.nextLine();
                c++;
                System.out.println("Digite seu peso:");
                jogadores[l][c] = ler.nextLine();
                c++;
                System.out.println("Digite sua altura : ");
                jogadores[l][c] = ler.nextLine();
                c++;
                System.out.println("Digite sua posicao: ");
                jogadores[l][c] = ler.nextLine();
                c++;
                System.out.println("Digite seu time, 0 para inter e 1 para gremio");
                jogadores[l][c] = ler.nextLine();
                l++;
                c = 0;
                
               
            }
            if (opcao == 2) {
                for (int i = 0; i < l ; i++) {
                    if(Integer.parseInt(jogadores[i][5]) == 0){
                            System.out.println("Nome: " + jogadores[i][0] + "\t");
                            System.out.println("Idade: " + jogadores[i][1] + "\t");
                            System.out.println("peso: " + jogadores[i][2] + "\t");
                            System.out.println("altura: " + jogadores[i][3] + "\t");
                            System.out.println("posicao: " + jogadores[i][4] + "\t");
                            System.out.println("-----------------------");
                            System.out.println("É DO INTERNACIONAL");
                        }
                    }
                }
            
            if (opcao == 3) {
                for (int i = 0; i < l ; i++) {
                    if(Integer.parseInt(jogadores[i][5]) == 1){
                            System.out.println("Nome: " + jogadores[i][0] + "\t");
                            System.out.println("Idade: " + jogadores[i][1] + "\t");
                            System.out.println("peso: " + jogadores[i][2] + "\t");
                            System.out.println("altura: " + jogadores[i][3] + "\t");
                            System.out.println("posicao: " + jogadores[i][4] + "\t");
                            System.out.println("-----------------------");
                            System.out.println("É DO gremio");
                        }
                    }
                }
            
            if (opcao == 4) {
                for (int i = 0; i < l ; i++) {
                            System.out.println("Nome: " + jogadores[i][0] + "\t");
                            System.out.println("Idade: " + jogadores[i][1] + "\t");
                            System.out.println("peso: " + jogadores[i][2] + "\t");
                            System.out.println("altura: " + jogadores[i][3] + "\t");
                            System.out.println("posicao: " + jogadores[i][4] + "\t");
                            System.out.println("-----------------------"); 
                            if(Integer.parseInt(jogadores[i][5]) == 1){
                                System.out.println("do gremio");
                            } else {
                                System.out.println("do inter");
                            }
                        }
                    }  
        } while(opcao != 5);
    }
}
