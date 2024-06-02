package JavaI.Provas;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 22200545
 */
public class PROVA1 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String[][] jogadores = new String[10][6];

        int opcao;
        int l = 0, c = 0;

        do {
            System.out.println("\nAgenda");
            System.out.println("1 - Cadastro de jogador");
            System.out.println("2 - Lista Time do Inter!");
            System.out.println("3 - Lista Time do Gremio!");
            System.out.println("4 - Lista todos os jogadores!");
            System.out.println("5 - Sair!");
            System.out.print("Opcao: ");
            opcao = Integer.parseInt(ler.nextLine());

            if (opcao == 1) {

                System.out.println("Digite seu nome: ");
                jogadores[l][c] = ler.nextLine(); // O c++ para preencher todas as colunas
                c++;
                System.out.println("Digite sua idade: ");
                jogadores[l][c] = ler.nextLine();
                c++;
                System.out.println("Digite seu peso: ");
                jogadores[l][c] = ler.nextLine();
                c++;
                System.out.println("Digite sua altura: ");
                jogadores[l][c] = ler.nextLine();
                c++;
                System.out.println("Digite sua posição: ");
                jogadores[l][c] = ler.nextLine();
                c++;
                System.out.println("Digite qual time voce quer: 0 para inter e 1 gremio");
                jogadores[l][c] = ler.nextLine();
                l++;
                c = 0;

            }
            if (opcao == 2) {
                System.out.println("Jogadores Colorados");
                for (int i = 0; i < l; i++) {
                    if (Integer.parseInt(jogadores[i][5]) == 0) {
                            System.out.println("-------------------------------");
                            System.out.println("Nome: " + jogadores[i][0]);
                            System.out.println("Idade: " + jogadores[i][1]);
                            System.out.println("Peso: " + jogadores[i][2] + "kg");
                            System.out.println("Altura: " + jogadores[i][3] + "m");
                            System.out.println("Posição: " + jogadores[i][4]);
                            System.out.println("Jogador do inter ");
                        
                    }
                }
            }

            if (opcao == 3) {
                System.out.println("Jogadores Gremistas");
                for (int i = 0; i < l; i++) {
                    if (Integer.parseInt(jogadores[i][5]) == 1) {
                       
                            System.out.println("-------------------------------");
                            System.out.println("Nome: " + jogadores[i][0]);
                            System.out.println("Idade: " + jogadores[i][1]);
                            System.out.println("Peso: " + jogadores[i][2] + "kg");
                            System.out.println("Altura: " + jogadores[i][3] + "m");
                            System.out.println("Posição: " + jogadores[i][4]);
                            System.out.println("Jogador do gremio");
                        }
                    }
                }

            if (opcao == 4) {
                System.out.println("Mostrando todos os Jogadores\n");

                for (int i = 0; i < l; i++) {
                        System.out.println("-------------------------------");
                        System.out.println("Nome: " + jogadores[i][0]);
                        System.out.println("Idade: " + jogadores[i][1]);
                        System.out.println("Peso: " + jogadores[i][2] + "kg");
                        System.out.println("Altura: " + jogadores[i][3] + "m");
                        System.out.println("Posição: " + jogadores[i][4]);

                        if (Integer.parseInt(jogadores[i][5]) == 0) {
                            System.out.println("Torce para o Time: inter");
                        } else {
                            System.out.println("Torce para o Time: gremio");

                        }

                    }
                }
            
        } while (opcao != 5);
    }
}

