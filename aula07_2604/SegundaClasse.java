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
public class SegundaClasse {
     public static void main(String[] args) {    
         double n1,n2,n3,n4,n5;                  // forma de colocar tudo em variaveis e depois colocar em um construtor
         String nome;                            // Lá na classe aluno está o construtor
        Scanner scan= new Scanner(System.in);   
        
        System.out.print("Digite o nome:");
        nome = scan.nextLine();
        System.out.print("Digite a nota de banco de dados 2:");
        n1 = Double.parseDouble(scan.nextLine().replace(",", "."));
        System.out.print("Digite a nota de estrutura de Dados: ");
        n2 =  Double.parseDouble(scan.nextLine().replace(",", "."));
        System.out.print("Digite a nota de C#: ");
        n3 =  Double.parseDouble(scan.nextLine().replace(",", "."));
        System.out.print("Digite a nota de Semiotica:");
        n4 = Double.parseDouble(scan.nextLine().replace(",", "."));
        System.out.print("Digite a nota de java1 :");
        n5 = Double.parseDouble(scan.nextLine().replace(",", "."));
        
       Aluno novo = new Aluno(nome, n1, n2, n3, n4, n5); // passando valores acima como objeto 
       
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
