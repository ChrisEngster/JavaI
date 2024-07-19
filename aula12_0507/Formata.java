/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaI.aula12_0507;

import java.text.NumberFormat;

/**
 *
 * @author 22200545
 */
public class Formata {

    public static void main(String[] args) {
        double n[] = {523.34, 54344.23, 95845.223, 1084.895};
        NumberFormat z = NumberFormat.getCurrencyInstance();  // tem a ver com a moeda usada na região do computador  
        for (int a = 0; a < n.length; a++) {
            if (a != 0) {
                System.out.print(", ");
            }
            System.out.print(z.format(n[a]));
        }
        System.out.println();
    }
}
