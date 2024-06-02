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
public class Conta {
    int numero;
    String dono;
    double saldo;
    double limite;
 public void sacar(double quantidade){ // cria uma classe vazia com o void
     double novoSaldo =  this.saldo - quantidade; // this puxa a variavel de fora no caso SALDO
     this.saldo = novoSaldo;
 }
}

