/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02_0103;

/**
 *
 * @author 22200545
 */
public class Exercicio2 {
    public static void main(String[] args) {
        int nota = 10;
        String resultado = "Seu resultado foi: ";
        
        switch(nota){
            case 10: resultado += "Execelente";
            break;
            case 9: resultado += "Otimo";
            break;
            case 8: resultado += "Bom";
            break;
            case 7: resultado += "Satisfatorio";
            break;
            default: resultado += "Regular";
            break;
        }
        System.out.println(resultado);
    }
}
