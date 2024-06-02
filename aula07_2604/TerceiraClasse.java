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
public class TerceiraClasse {
 
    public static void main(String[] args) {
        
    Scanner scan = new Scanner(System.in);               // forma de colocar tudo em variaveis e depois colocar em um construtor

    int opcao;
        do{
            System.out.println("----Cadastro de alunos----");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Listar alunos");
            System.out.println("3 - Sair");
            System.out.print("Opcao: ");
            opcao = Integer.parseInt(scan.nextLine());
            
            if(opcao == 1 ){
                
        Aluno novo = new Aluno();
        System.out.print("Digite o nome:");
        novo.nome = scan.nextLine();
        System.out.print("Digite a nota de banco de dados 2:");
        novo.notaBancoDados2= Double.parseDouble(scan.nextLine().replace(",", "."));
        System.out.print("Digite a nota de estrutura de Dados: ");
        novo.notaEstruturaDados = Double.parseDouble(scan.nextLine().replace(",", "."));
        System.out.print("Digite a nota de C#: ");
        novo.notaCSharp =  Double.parseDouble(scan.nextLine().replace(",", "."));
        System.out.print("Digite a nota de Semiotica:");
        novo.notaSemiotica = Double.parseDouble(scan.nextLine().replace(",", "."));
        System.out.print("Digite a nota de java1 :");
        novo.notaJava1 = Double.parseDouble(scan.nextLine().replace(",", "."));
        
        novo.media = (novo.notaBancoDados2 + novo.notaCSharp + novo.notaEstruturaDados
                 + novo.notaJava1 + novo.notaSemiotica) / 5;
        Aluno.lista.add(novo);
            }
            if (opcao == 2) {
               System.out.println("Lista de alunos");
                if (Aluno.lista.isEmpty()) {
                    System.out.println("Nao ha alunos cadastrados");
                } else {
                for(Aluno jog: Aluno.lista){
                    System.out.println("-----------");
                    System.out.println("nome do aluno: " + jog.nome);
                    System.out.println("nota banco de dados : " + jog.notaBancoDados2);
                    System.out.println("nota estrutura de dados: " + jog.notaEstruturaDados);
                    System.out.println("nota C#: " + jog.notaCSharp);
                    System.out.println("nota semiotica: " + jog.notaSemiotica);
                    System.out.println("nota java1: " + jog.notaJava1);
                    System.out.println("Media do Aluno: " + jog.media);
                    System.out.println("------------");
                    }
                }
            }
    
            
        }while (opcao != 3);
}
    }
    
