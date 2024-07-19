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
// pega o extends do gerente 
public class Diretor extends Gerente {
    private double lucros = 3000.00;
    public static void main(String args[]) {
        Diretor d = new Diretor();
        d.setSalario(22, 35.00);
        System.out.println(d.getSalario());
    }
    @Override
    public double getSalario() {
        return super.getSalario() + this.lucros;
    }
}
