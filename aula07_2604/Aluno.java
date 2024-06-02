/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaI.aula07_2604;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 22200545
 */
public class Aluno {
    
    public String nome;
    public double notaBancoDados2,
            notaEstruturaDados,
            notaCSharp,
            notaSemiotica,
            notaJava1,
            media;
    
    public static List <Aluno> lista = new ArrayList();
    
    
    // nome do construtor precisa ser igual o nome da classe
    //Segunda classe
    // seria um metodo(funcao) para mostrar 
    public Aluno(String Nome, double Nota1, double Nota2, double Nota3,
            double Nota4, double Nota5){     
        nome = Nome;        
        notaBancoDados2 = Nota1;
        notaEstruturaDados = Nota2;
        notaCSharp = Nota3;
        notaSemiotica = Nota4;
        notaJava1 = Nota5;
        media = (Nota1 + Nota2 + Nota3 + Nota4 + Nota5) / 5;
    }
    

    //Primeira classe forma de fazer clica em Aluno
    // forma de criar padrao (Clica no public Aluno - Refatorar -  introduzir - metodo
    public Aluno(String nome, double notaBancoDados2, double notaEstruturaDados, double notaCSharp, double notaSemiotica, double notaJava1, double media) {
        this.nome = nome;
        this.notaBancoDados2 = notaBancoDados2;
        this.notaEstruturaDados = notaEstruturaDados;
        this.notaCSharp = notaCSharp;
        this.notaSemiotica = notaSemiotica;
        this.notaJava1 = notaJava1;
        this.media = media;
    }
    //Primeira classe
    public Aluno(){
        // criando construtor para a (PrimeiraClasse)
    }
    
    
}
