/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaI.aula12_0507;

import java.util.Scanner;

/**
 *
 * @author 22200545
 */
public class TesteSoma {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Soma soma = new Soma();
        int a,b;
        double num,num1;
        String s,s1;
        System.out.print("Digite um numero inteiro : ");
        a=Integer.parseInt(ler.nextLine());
        System.out.print("Digite outro numero inteiro : ");
        b=Integer.parseInt(ler.nextLine());
        System.out.println("A soma é "+soma.Somar(a, b));
        System.out.print("Digite um numero decimal : ");
        num = Double.parseDouble(ler.nextLine().replace(",", "."));
        System.out.print("Digite outro numero decimal : ");
        num1 = Double.parseDouble(ler.nextLine().replace(",", "."));
        System.out.println("A soma é "+soma.Somar(num,num1));
        System.out.print("Digite uma palavra : ");
        s = ler.nextLine();
        System.out.print("Digite outra palavra : ");
        s1 = ler.nextLine();
        System.out.println("A soma é "+soma.Somar(s, s1));
    }
}
