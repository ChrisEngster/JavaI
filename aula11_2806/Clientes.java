/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11_2806;

/**
 *
 * @author 22200545
 */
public class Clientes {
    
    private String nome;
    private String endereco;
    private String dataCadastro;
    private int telefone;
    private int codigo;
    private double limiteCredito;

    public Clientes(String nome, String endereco, String dataCadastro, int telefone, int codigo, double limiteCredito) {
        this.nome = nome;
        this.endereco = endereco;
        this.dataCadastro = dataCadastro;
        this.telefone = telefone;
        this.codigo = codigo;
        this.limiteCredito = limiteCredito;
    }
    
    public Clientes(){
        
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
}
