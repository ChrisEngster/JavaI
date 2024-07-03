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
public class TerceiraClasse {

    public static void main(String[] args) {

        int opcao = 0;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("\nCadastro de alunos:-------");
            System.out.println("\n1 - Cadastrar alunos e notas:");
            System.out.println("\n2 - Listar aluno e notas");
            System.out.println("\n3 - Sair");
            System.out.print("Opcao:");
            opcao = Integer.parseInt(scan.nextLine());

            if (opcao == 1) {
                Aluno novo = new Aluno();
                
                System.out.print("\nDigite o nome:");
                novo.nome = scan.nextLine();
                System.out.print("Digite a nota de banco de dados 2:");
                novo.notaBancoDados2 = Double.parseDouble(scan.nextLine().replace(",", "."));
                System.out.print("Digite a nota de estrutura de Dados: ");
                novo.notaEstruturaDados = Double.parseDouble(scan.nextLine().replace(",", "."));
                System.out.print("Digite a nota de C#: ");
                novo.notaCSharp = Double.parseDouble(scan.nextLine().replace(",", "."));
                System.out.print("Digite a nota de Semiotica:");
                novo.notaSemiotica = Double.parseDouble(scan.nextLine().replace(",", "."));
                System.out.print("Digite a nota de java1 :");
                novo.notaJava1 = Double.parseDouble(scan.nextLine().replace(",", "."));

                novo.media = (novo.notaBancoDados2 + novo.notaCSharp + novo.notaEstruturaDados
                        + novo.notaJava1 + novo.notaSemiotica) / 5;
                
                Aluno.lista.add(novo);
                
                System.out.println("Aluno adicionado");
            }

            if (opcao == 2) {
                System.out.println("Lista de alunos e notas");
                if (Aluno.lista.isEmpty()) {
                    System.out.println("\nSem alunos cadastrados!!!!!!");
                } else{
                    for(Aluno novo: Aluno.lista){ 
                    System.out.printf(" \" %s \" "     
                + "%2.2f em Banco de dados 2, "       
                + "%2.2f em Semiotica, "
                + "%2.2f em Estrutura de Dados, "
                + "%2.2f em C#, "
                + "%2.2f em Java I, "
                + "e média %2.2f ", novo.nome, novo.notaBancoDados2, novo.notaSemiotica, novo.notaEstruturaDados,
                novo.notaCSharp, novo.notaJava1, novo.media);
                    }
                }
            }

        } while (opcao != 3);
    }
}
