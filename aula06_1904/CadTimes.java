/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06_1904;

import java.util.Scanner;

/**
 *
 * @author 22200545
 */
public class CadTimes {

    public static Scanner scan = new Scanner(System.in); // scanner é da classe cadTimes por isso colocar public static

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\n\nCadastro de jogadores");
            System.out.println("1- Cadastrar jogador inter");
            System.out.println("2- cadastrar jogador gremio");
            System.out.println("3- Listar time do inter");
            System.out.println("4- Listar time do gremio");
            System.out.println("5- Listar times");
            System.out.println("6- Sair");
            System.out.print("opcao: ");
            opcao = Integer.parseInt(scan.nextLine());

            if (opcao == 1) {
                cadastrarInter(); // adicionando ao objeto jogador da List inter
            }

            if (opcao == 2) {
                cadastrarGremio(); // adicionando ao objeto jogador da List Gremio                
            }
            if (opcao == 3) {
                listaInter();
            }

            if (opcao == 4) {
                listaGremio();
            }

            if (opcao == 5) {
                listaTodos();
            }
        } while (opcao != 6);
    }

    public static void cadastrarInter() {   // public static void porque nao tem retorno
        System.out.println("\nCadastro Jogador");
        jogador novo = new jogador(); // criei um objeto chamado novo da classe 'jogador'

        System.out.print("Digite o nome: ");
        novo.nome = scan.nextLine();

        System.out.print("Digite a idade: ");
        novo.idade = Integer.parseInt(scan.nextLine());

        System.out.print("Digite a posicao: ");
        novo.posicao = scan.nextLine();

        System.out.print("Digite a altura: ");
        novo.altura = Double.parseDouble(scan.nextLine().replace(",", "."));

        System.out.print("Digite o peso: ");
        novo.peso = Double.parseDouble(scan.nextLine().replace(",", "."));

        jogador.Inter.add(novo);
    }

    public static void cadastrarGremio() {
        System.out.println("\nCadastro Jogador");
        jogador novo = new jogador(); // criei um objeto chamado novo da classe 'jogador'

        System.out.print("Digite o nome: ");
        novo.nome = scan.nextLine();

        System.out.print("Digite a idade: ");
        novo.idade = Integer.parseInt(scan.nextLine());

        System.out.print("Digite a posicao: ");
        novo.posicao = scan.nextLine();

        System.out.print("Digite a altura: ");
        novo.altura = Double.parseDouble(scan.nextLine().replace(",", "."));

        System.out.print("Digite o peso: ");
        novo.peso = Double.parseDouble(scan.nextLine().replace(",", "."));

        jogador.Gremio.add(novo);
    }

    public static void listaInter() {
        System.out.println("\n ----Lista do inter----");

        if (jogador.Inter.isEmpty()) { // .isEmpty para ver se nao tem nada na lista
            System.out.println("nao ha jogadores cadastrados!!!");
        } else {
            for (jogador jog : jogador.Inter) { //forma de usar o for para listar objetos com outra classe e novo objeto

                System.out.println("Nome: " + jog.nome);
                System.out.println("Idade: " + jog.idade);
                System.out.println("Posicao: " + jog.posicao);
                System.out.println("Altura: " + jog.altura);
                System.out.println("peso: " + jog.peso);
                System.out.println("---------------");

            }
        }
    }

    public static void listaGremio() {
        System.out.println("\n ----Lista do gremio----");

        if (jogador.Gremio.isEmpty()) {
            System.out.println("nao ha jogadores cadastrados!!! ");
        } else {
            for (jogador jog : jogador.Gremio) { //forma de usar o for para listar objetos 

                System.out.println("Nome: " + jog.nome);
                System.out.println("Idade: " + jog.idade);
                System.out.println("Posicao: " + jog.posicao);
                System.out.println("Altura: " + jog.altura);
                System.out.println("peso: " + jog.peso);
                System.out.println("---------------");
            }
        }
    }
    
    public static void listaTodos(){
        System.out.println("Lista de todos os jogadores");
                for (jogador jog : jogador.Gremio) {
                    System.out.println("\n---Jogador do gremio---");
                    System.out.println("Nome: " + jog.nome);
                    System.out.println("Idade: " + jog.idade);
                    System.out.println("Posicao: " + jog.posicao);
                    System.out.println("Altura: " + jog.altura);
                    System.out.println("peso: " + jog.peso);
                    System.out.println("---------------");
                }
                for (jogador jog : jogador.Inter) {
                    System.out.println("\n---Jogador do inter---");
                    System.out.println("Nome: " + jog.nome);
                    System.out.println("Idade: " + jog.idade);
                    System.out.println("Posicao: " + jog.posicao);
                    System.out.println("Altura: " + jog.altura);
                    System.out.println("peso: " + jog.peso);
                    System.out.println("---------------");
                }
    }
}
