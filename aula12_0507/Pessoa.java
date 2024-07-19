/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaI.aula12_0507;

/**
 *
 * @author 22200545
 */

// classe pai ou SUPER classe
public abstract class Pessoa { // classe que nao pode ter instanciada nao pode ser mudada 

    protected int codPessoa; // protect só pode pegar eles na classe pai(pai) e as que derivam dela
    protected String nome;
    protected int idade;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa() {
    }
    
    
    // criando metodo para pegar na classe filho (pessoaFisica) e modificar
    public abstract String getNome();

    public abstract void setCodPessoa(int codigo);

    public abstract int getIdade();

    public abstract void setIdade(int idade);

}
