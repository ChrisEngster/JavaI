/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaI.aula11_2806;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 22200545
 */
public class ConsumidorFinal extends Clientes {

    private int rg;
    private int cpf;
    private String sexo;
    private String dataNascimento;
    
    public static List<ConsumidorFinal> clientes = new ArrayList();

    public ConsumidorFinal(String nome, String endereco, String dataCadastro, int telefone, int codigo, double limiteCredito, int rg, int cpf, String sexo, String dataNascimento) {
        super(nome, endereco, dataCadastro, telefone, codigo, limiteCredito);
        this.rg = rg;
        this.cpf = cpf;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
    }
    
    public ConsumidorFinal(){
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
}
