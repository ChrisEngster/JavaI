/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaI.aula10_2106;


import java.util.Scanner;

/**
 *
 * @author marci
 */
public class cadImpressoras {

    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao = 0;
        do {
            System.out.println("\n\n**** Impressoras *****");
            System.out.println(" 1 - Cadastrar Matricial");
            System.out.println(" 2 - Cadastrar Laser");
            System.out.println(" 3 - Listar Matriciais");
            System.out.println(" 4 - Listar Lasers");
            System.out.println(" 5 - Listar todas");
            System.out.println(" 6 - Sair");
            System.out.print(" Opcao : ");
            opcao = Integer.parseInt(entrada.nextLine());
            if (opcao == 1) {
                cadastrarMatricial();
            }
            if (opcao == 2) {
                cadastrarLaser();
            }
            if (opcao == 3) {
                listarMatriciais();
            }
            if (opcao == 4) {
                listarLasers();
            }
            if (opcao == 5) {
                System.out.println("\n*** Lista de Todas Impressoras ***\n");
                listarMatriciais();
                listarLasers();
            }
        } while (opcao != 6);
    }

    public static void cadastrarMatricial() {
        String colorida = "";
        String vias = "";
        System.out.println("\n**** Cadastro de Impressora Matricial ***");
        Matricial nova = new Matricial();
        System.out.print("Digite a marca : ");
        nova.setMarca(entrada.nextLine());
        System.out.print("Digite o Modelo : ");
        nova.setModelo(entrada.nextLine());
        do {
            System.out.print("Imprime Colorido (S/N): ");
            colorida = entrada.nextLine();
            if (colorida.equalsIgnoreCase("S")) {
                nova.setColorida(true);
            } else {
                nova.setColorida(false);
            }
        } while (!colorida.equalsIgnoreCase("S") && !colorida.equalsIgnoreCase("N"));
        do {
            System.out.print("Imprime vias (S/N): ");
            vias = entrada.nextLine();
            if (vias.equalsIgnoreCase("S")) {
                nova.setImprimeVias(true);
            } else {
                nova.setImprimeVias(false);
            }
        } while (!vias.equalsIgnoreCase("S") && !vias.equalsIgnoreCase("N"));
        System.out.print("Digite o número de agulhas : ");
        nova.setNumAgulhas(Integer.parseInt(entrada.nextLine()));
        System.out.print("Digite o peso : ");
        nova.setPeso(Double.parseDouble(entrada.nextLine().replace(",", ".")));
        Matricial.matriciais.add(nova);
        System.out.println("\nImpressora Adicionado com Sucesso !\n");

    }

    public static void cadastrarLaser() {
        String frenteVerso = "";
        String colorida = "";
        System.out.println("\n**** Cadastro de Impressora Laser ***");
        Laser nova = new Laser();
        System.out.print("Digite a marca : ");
        nova.setMarca(entrada.nextLine());
        System.out.print("Digite o Modelo : ");
        nova.setModelo(entrada.nextLine());
        do {
            System.out.print("Imprime Colorido (S/N): ");
            colorida = entrada.nextLine();
            if (colorida.equalsIgnoreCase("S")) {
                nova.setColorida(true);
            } else {
                nova.setColorida(false);
            }
        } while (!colorida.equalsIgnoreCase("S") && !colorida.equalsIgnoreCase("N"));
        do {
            System.out.print("Imprime frente e verso (S/N): ");
            frenteVerso = entrada.nextLine();
            if (frenteVerso.equalsIgnoreCase("S")) {
                nova.setFrenteVerso(true);
            } else {
                nova.setFrenteVerso(false);
            }
        } while (!frenteVerso.equalsIgnoreCase("S") && !frenteVerso.equalsIgnoreCase("N"));
        System.out.print("Digite o peso : ");
        nova.setPeso(Double.parseDouble(entrada.nextLine().replace(",", ".")));
        System.out.print("Digite a capacidade do Toner : ");
        nova.setCapacidadeToner(Double.parseDouble(entrada.nextLine().replace(",",".")));
        Laser.lasers.add(nova);
        System.out.println("\nImpressora Adicionado com Sucesso !\n");

    }

    public static void listarMatriciais() {
        System.out.println("\n*** Lista de Matriciais ***");
        if (Matricial.matriciais.isEmpty()) {
            System.out.println("Não tem impressoras matriciais cadastradas");
        } else {
            for (Matricial impressora : Matricial.matriciais) {
                System.out.println("\nMarca : " + impressora.getMarca());
                System.out.println("Modelo : " + impressora.getModelo());
                System.out.println("Impressão Colorida : " + 
                        ((impressora.isColorida()) ? "S" : "N"));
                System.out.println("Imprime Vias : " + 
                        ((impressora.isImprimeVias()) ? "S" : "N"));
                System.out.println("Peso : " + impressora.getPeso());
                System.out.println("Numero de Agulhas : " + impressora.getNumAgulhas());
                System.out.println("----------------------------------------------------------------\n");
            }
        }

    }

    public static void listarLasers() {
        System.out.println("\n*** Lista de Lasers ***");
        if (Laser.lasers.isEmpty()) {
            System.out.println("Não tem impressoras lasers cadastradas");
        } else {
            for (Laser impressora : Laser.lasers) {
                System.out.println("\nMarca : " + impressora.getMarca());
                System.out.println("Modelo : " + impressora.getModelo());
                System.out.println("Impressão Colorida : " +
                        ((impressora.isColorida()) ? "S" : "N"));
                System.out.println("Imprime Frente e Verso : " + 
                        ((impressora.isFrenteVerso()) ? "S" : "N"));
                System.out.println("Peso : " + impressora.getPeso());
                System.out.println("Capacidade Toner : " + impressora.getCapacidadeToner());
                System.out.println("----------------------------------------------------------------\n");
            }
        }

    }

}