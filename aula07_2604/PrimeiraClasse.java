/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaI.aula07_2604;

import java.util.Scanner;

/**
 *
 * @author 22200545
 */
public class PrimeiraClasse {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        Aluno novo = new Aluno();
        System.out.print("Digite o nome:");
        novo.nome = scan.nextLine();
        System.out.print("Digite a nota de banco de dados 2:");
        novo.notaBancoDados2 = Double.parseDouble(scan.nextLine().replace(",", "."));
        System.out.print("Digite a nota de estrutura de Dados: ");
        novo.notaEstruturaDados =  Double.parseDouble(scan.nextLine().replace(",", "."));
        System.out.print("Digite a nota de C#: ");
        novo.notaCSharp =  Double.parseDouble(scan.nextLine().replace(",", "."));
        System.out.print("Digite a nota de Semiotica:");
        novo.notaSemiotica = Double.parseDouble(scan.nextLine().replace(",", "."));
        System.out.print("Digite a nota de java1 :");
        novo.notaJava1 = Double.parseDouble(scan.nextLine().replace(",", "."));
        
        novo.media = (novo.notaBancoDados2 + novo.notaCSharp + novo.notaEstruturaDados
                 + novo.notaJava1 + novo.notaSemiotica) / 5;
       
        // \" para exibir aspas duplas 
                // %s para pegar a string
                // %2.2f para pegar duas casas antes do ponto e duas depois
        System.out.printf("Aluno \" %s \" tirou : \n"     
                + "%2.2f em Banco de dados 2, \n"       
                + "%2.2f em Semiotica, \n"
                + "%2.2f em Estrutura de Dados, \n"
                + "%2.2f em C#, \n"
                + "%2.2f em Java I, \n"
                + "e obteve média %2.2f \n", novo.nome, novo.notaBancoDados2, novo.notaSemiotica, novo.notaEstruturaDados,
                novo.notaCSharp, novo.notaJava1, novo.media);
      
    }
}
