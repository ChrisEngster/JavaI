/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03_0803;

import java.util.Scanner;

 
/**
 *
 * @author 22200545
 */
public class ExemploScanner {
    private long codigo;
    private String primeiroNome;
    private String sobrenome;
    private int idade;
    public String mostrarDigitação(){
        return "Digitad {"
                + "codigo=" + codigo
                + ", Primeiro nome= '" + primeiroNome + '\'' 
                + ", Sobrenome = '" + sobrenome + '\''
                + ", idade=" + idade
                + '}' + "\n";
}
    
    public static void main(String[] args) {
        // lendoUm();
        lendoDois();
    }
    
private static void lendoUm() {
    Scanner scanner = new Scanner(System.in);   // para fazer a leitura de uma variavel
    
    ExemploScanner t = new ExemploScanner();
    System.out.print("Entre com o seu codigo: ");
    t.codigo = scanner.nextInt();
    
    System.out.print("Digite seu primeiro nome: ");
    t.primeiroNome = scanner.nextLine();
    
    System.out.print("Digite seu sobrenome: ");
    t.sobrenome = scanner.nextLine();
    
    System.out.print("Digite sua idade: ");
    t.idade = scanner.nextInt();
    
    System.out.println(t.mostrarDigitação());
    }

    private static void lendoDois() {
    Scanner scanner = new Scanner(System.in); 
    
    ExemploScanner t = new ExemploScanner();
    System.out.print("Entre com o seu codigo: ");
    t.codigo = Long.parseLong(scanner.nextLine());
    // Usa o Scanner para string e depois converte para int
    //Li o que foi digitado como string e transformei para Long
    
    System.out.print("Digite seu primeiro nome: ");
    t.primeiroNome = scanner.nextLine();    
    
    System.out.print("Digite seu sobrenome: ");
    t.sobrenome = scanner.nextLine();
    
    System.out.print("Digite sua idade: ");
    //Li o que foi digitado como string e transformei para int
    t.idade = Integer.parseInt(scanner.nextLine()); 
    
    System.out.println(t.mostrarDigitação());
    }
}
