/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11_2806;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 22200545
 */
public class Empresa extends Clientes {

    //empresa
    private int cnpj;
    private String inscricaoEstadual;
    private String dataFundacao;
    
        public static List<Empresa> empresas = new ArrayList();


    public Empresa(String nome, String endereco, String dataCadastro, int telefone, int codigo, double limiteCredito, int cnpj, String inscricaoEstadual, String dataFundacao) {
        super(nome, endereco, dataCadastro, telefone, codigo, limiteCredito);
        this.cnpj = cnpj;
        this.dataFundacao = dataFundacao;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public Empresa() {
    }



    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public String getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(String dataFundacao) {
        this.dataFundacao = dataFundacao;
    }
    
    
}
