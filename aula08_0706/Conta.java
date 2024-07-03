/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaI.aula08_0706;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 22200545
 */
public class Conta {

    public String nome;
    public double numero, saldo , limite;

    public static List<Conta> lista = new ArrayList();

    public void sacar(double quantidade) {
        if (this.saldo < quantidade) {
            System.out.println("Você nao tem saldo suficiente para saque!!");
        } else {
            double novoSaldo = this.saldo - quantidade;
            this.saldo = novoSaldo;
        }
    }

    public void mostrarSaldo(double saldo) {
        this.saldo = saldo;
        System.out.println("saldo atual: " + saldo);
    }

    public void depositar(double quantidade) {
       this.saldo += quantidade;
    }
}
