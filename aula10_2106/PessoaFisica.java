/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10_2106;

import java.util.Scanner;

/**
 *
 * @author 22200545
 */
public class PessoaFisica extends Pessoa { // puxa a pessoa

    public PessoaFisica(String nome) {  //chamou o construtor por isso a public pessoaFisica
        super(nome);                    //para gerar os getter e setter
    }

    public PessoaFisica() { // criar construtor na classe pai e filho
    }

    //instaciei da classe super 'pai' seria a PESSOA 
    public int getCodPessoa() {
        return codPessoa;
    }

    @Override
    public void setCodPessoa(int codPessoa) {
        this.codPessoa = codPessoa;
    }

    @Override
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int getIdade() {
        return idade;
    }

    @Override
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PessoaFisica pf = new PessoaFisica();   // quando cria esse objeto precisa criar construtor
                                                // na pessoa e PessoaFisica
        System.out.print("Digite o nome");
        pf.setNome(scan.nextLine());
        System.out.print("Digite a idade");
        pf.setIdade(Integer.parseInt(scan.nextLine()));
        System.out.println("Codigo de pessoa");
        pf.setCodPessoa(Integer.parseInt(scan.nextLine()));
        System.out.printf( "\n%s ,codigo %d ,idade: %d. \n" , pf.getNome(), pf.getIdade(), pf.getCodPessoa());
        
    }

}
