/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaI.aula09_1406;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author 22200545
 */
public class Banco {

    public String nome;
    public Double saldo, limiteSaque = 1000.00;
    public Boolean sacar = true;
    public int numero;
    Random numeroConta = new Random();

    public static List<Banco> lista = new ArrayList();
    
    public Banco(String nome, double saldo, boolean saque, int numero){
        this.nome = nome;
        this.saldo = saldo;
        this.numero = numero;
        this.sacar = saque;
    }
    
    public Banco(){
        // criando construtor para a (PrimeiraClasse)
    }

    public void numeroConta() {
        numero = 1 + numeroConta.nextInt(9999);
        System.out.println(numero);
    }

    public void saque(double quantidade) {
        if (this.saldo + this.limiteSaque < quantidade) {
            System.out.println("Você não tem saldo suficiente pra saque");
        } else if (sacar == false) {
            System.out.println("Saque limite efetuado");
        } else {
            this.saldo = this.saldo - quantidade;
            sacar = false;
        }
    }

    public void deposita(double quantidade) {
        this.saldo += quantidade;
    }

    public void exibir() {
        System.out.println("Saldo atual: " + saldo);
    }
    

}
