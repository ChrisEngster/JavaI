/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaI.aula03_0803;

/**
 *
 * @author 22200545
 */
public class Programa {
    public static void main(String[] args) {
        Conta minhaConta;
        minhaConta = new Conta(); // objeto minha conta
        minhaConta.dono = "Chris";
        minhaConta.numero = 1512;
        minhaConta.saldo = 1532.54;
        minhaConta.limite = 5000;
        System.out.println("A conta de " + minhaConta.dono+ " - numero: "
                + minhaConta.numero + " tem saldo R$" + minhaConta.saldo);
        
        minhaConta.sacar(200.00); // executando public void double da Conta.java
        
             System.out.println("A conta de " + minhaConta.dono+ " - numero: "
                + minhaConta.numero + " tem novo saldo R$" + minhaConta.saldo);
    }
}
