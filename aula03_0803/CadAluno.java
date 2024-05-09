/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03_0803;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class CadAluno {
    public static void main(String[] args) {
        Aluno souAluno;
        souAluno = new Aluno();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o numero da matricula: ");
        souAluno.numMatricula = Integer.parseInt(scanner.nextLine()); 
        
        
        System.out.print("Digite o seu nome: ");
        souAluno.nomeAluno = scanner.nextLine();
        
        System.out.print("Digite o valor da sua mensalidade: ");
        souAluno.vlrMensalidade = Double.parseDouble(scanner.nextLine());
        
        System.out.println("{Nome:" + souAluno.nomeAluno + ", Matricula:" + souAluno.numMatricula + ", Mensalidade:" + souAluno.vlrMensalidade + "}");
    }
}
