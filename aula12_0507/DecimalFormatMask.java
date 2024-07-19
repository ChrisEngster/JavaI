/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaI.aula12_0507;

import java.text.DecimalFormat;

/**
 *
 * @author 22200545
 */
public class DecimalFormatMask {
    public static void main(String args[]) {
        double valor = 1045.561;
        DecimalFormat df = new DecimalFormat("###,###.###"); // passamos a mascara que queremos
        
        System.out.println(df.format(valor));
        df = new DecimalFormat("###,###.00");
        System.out.println(df.format(valor));
        df.applyPattern("#,###.00");
        System.out.println(df.format(valor));
        df.applyPattern("$#,###.00");
        System.out.println(df.format(valor));
        df.applyPattern("###.##;(###.##)");
        System.out.println(df.format(valor - 1500.54));
    }
}
