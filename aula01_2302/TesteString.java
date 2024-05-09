/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula01_2302;

/**
 *
 * @author 22200545
 */
public class TesteString {
    public static void main(String[] args) {
        String string  = "String aqui";
        
        // string minuscula é variavel e String maiscula é classe
        
        String string1  =  string + ", e esta é outra string";

        System.out.println(string);
        System.out.println(string1);
        
        System.out.println(string1.concat(",concatenei outra string") + " e tem ao total " + string1.length() + ", caracters");
        System.out.println(string.concat(",concatenei outra string").length());
    }
}
