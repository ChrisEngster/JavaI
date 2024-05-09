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
public class CadAlunos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao;
        
        do {
            System.out.println("----Cadastro de alunos----");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Listar alunos");
            System.out.println("3 - Sair");
            System.out.print("Opcao: ");
            opcao = Integer.parseInt(scan.nextLine());
            
            if(opcao == 1 ){
                alunos novo = new alunos();
                
                System.out.println("Digite seu nome:");
                novo.nomeAluno = scan.nextLine();
                System.out.println("Digite o valor da mensalidade");
                novo.vlrMensalidade = Double.parseDouble(scan.nextLine());
                System.out.println("Digite o numero da matricula");
                novo.numMatricula = Integer.parseInt(scan.nextLine());
                
                alunos.alunos.add(novo);
            }
            
            if(opcao == 2){
                System.out.println("Lista de alunos");
                if (alunos.alunos.isEmpty()) {
                    System.out.println("Nao ha alunos cadastrados");
                } else {
                for(alunos jog: alunos.alunos){
                    System.out.println("-----------");
                    System.out.println("nome do aluno: " + jog.nomeAluno);
                    System.out.println("valor de sua mensalidade: " + jog.vlrMensalidade);
                    System.out.println("numero de matricula: " + jog.numMatricula);
                    System.out.println("------------");
                    }
                }
            }
        } while (opcao != 3);
        
    }
}
