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
public class ExemploExcecao {
    public static void main(String args[]) {
        int status = 0;
        String texto[] = {"É bom programar em java.",
            "Não, quero dizer", "É ótimo programar em Java!"};
        try {
            for (int i = 0; texto.length >= i; i++) {   // try pode dar erro
                System.out.println(texto[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) { 
            System.out.println("Exceção: " + e);    // ocorreu erro pq o array texto só tem 2 objetos
            status = 1;
        } finally {
            System.exit(status);
        }
    }
}
