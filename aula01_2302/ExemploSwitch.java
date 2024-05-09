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
public class ExemploSwitch {
    public static void main(String[] args) {
        char opcao = 'b';
        String selecao = "Você selecionou: ";

        switch(opcao){
            case 'a': selecao += 'a';
            break;
            case 'b': selecao += 'b';
            break;
            case 'c': selecao += 'c';
            break;
            default:
                selecao += " uma opção invalida";
        }
        System.out.println(selecao);
    }
}
