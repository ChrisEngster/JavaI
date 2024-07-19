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
public class Gerente extends Empregado {
     private double bonus = .15; // porcentagem de bonus %
    public static void main(String args[]) {
        Gerente g = new Gerente();
        g.setSalario(22, 35.00);
        System.out.println(g.getSalario());
    }
    @Override // polimorfismo pega o mesmo salario do empregado mais o bonus 
    public double getSalario() {
        return super.getSalario() + 
                (super.getSalario() * this.bonus);
    }
}
