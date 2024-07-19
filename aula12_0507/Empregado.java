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
public class Empregado {
    private double salario;
    public void setSalario(int diastrabalhados,
            double valorhora) {
        this.salario = diastrabalhados
                * valorhora * 8;
    }
    public double getSalario() {
        return this.salario;
    }
}
