/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaI.aula11_2806;

import java.util.Scanner;

/**
 *
 * @author 22200545
 */
public class CadClientes {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao = 0;
        do {
            System.out.println("----Sistema de Cadastro----");
            System.out.println("1 - Cadastro de cliente");
            System.out.println("2 - Cadastro de empresa");
            System.out.println("3 - Listar clientes");
            System.out.println("4 - listar empresas");
            System.out.println("5 - Listar consumidor final");
            System.out.println("6 - SAIR");
            System.out.print("opcao: ");
            opcao = Integer.parseInt(scan.nextLine());
            
            if(opcao == 1){
                cadastroCliente();
            }
            if(opcao == 2){
                cadastroEmpresa();
            }
            if(opcao == 3){
                listarClientes();
            }
            if(opcao == 4){
                listarEmpresa();
            }
            if(opcao == 5){
                listarClientes();
                listarEmpresa();
            }
        } while (opcao != 6);

    }

    public static void cadastroCliente() {

        ConsumidorFinal nova = new ConsumidorFinal();

        System.out.println("Digite seu nome: ");
        nova.setNome(scan.nextLine());
        System.out.println("Digite seu endereco: ");
        nova.setEndereco(scan.nextLine());
        System.out.println("Data de cadastro: ");
        nova.setDataCadastro(scan.nextLine());
        System.out.println("Digite seu telefone: ");
        nova.setTelefone(Integer.parseInt(scan.nextLine()));
        System.out.println("Digite codigo do cliente");
        nova.setCodigo(Integer.parseInt(scan.nextLine()));
        System.out.println("Digite limite de credito");
        nova.setLimiteCredito(Double.parseDouble(scan.nextLine().replace(",", ".")));
        System.out.println("Digite seu RG:");
        nova.setRg(Integer.parseInt(scan.nextLine()));
        System.out.println("Digite seu CPF:");
        nova.setCpf(Integer.parseInt(scan.nextLine()));
        System.out.println("Digite seu sexo:");
        nova.setSexo(scan.nextLine());
        System.out.println("Data de nascimento:");
        nova.setDataNascimento(scan.nextLine());

        ConsumidorFinal.clientes.add(nova);
    }

    public static void cadastroEmpresa() {

        Empresa nova = new Empresa();

        System.out.println("Digite o nome da empresa: ");
        nova.setNome(scan.nextLine());
        System.out.println("Digite seu endereco: ");
        nova.setEndereco(scan.nextLine());
        System.out.println("Data de cadastro: ");
        nova.setDataCadastro(scan.nextLine());
        System.out.println("Digite seu telefone: ");
        nova.setTelefone(Integer.parseInt(scan.nextLine()));
        System.out.println("Digite codigo do cliente: ");
        nova.setCodigo(Integer.parseInt(scan.nextLine()));
        System.out.println("Digite limite de credito: ");
        nova.setLimiteCredito(Double.parseDouble(scan.nextLine().replace(",", ".")));
        System.out.println("Digite o CNPJ da empresa: ");
        nova.setCnpj(Integer.parseInt(scan.nextLine()));
        System.out.println("Digite a inscrição estadual: ");
        nova.setInscricaoEstadual(scan.nextLine());
        System.out.println("Data de fundação da empresa: ");
        nova.setDataFundacao(scan.nextLine());

        Empresa.empresas.add(nova);
    }

    public static void listarClientes() {
        System.out.println("----Lista de clientes----");
        if (ConsumidorFinal.clientes.isEmpty()) {
            System.out.println("Não contem clientes cadastrados!!");
        } else {
            for (ConsumidorFinal index : ConsumidorFinal.clientes) {
                System.out.println("nome: " + index.getNome());
                System.out.println("endereco: " + index.getEndereco());
                System.out.println("Data de cadastro: " + index.getDataCadastro());
                System.out.println("telefone: " + index.getTelefone());
                System.out.println("codigo do cliente" + index.getCodigo());
                System.out.println("limite de credito" + index.getLimiteCredito());
                System.out.println("RG:" + index.getRg());
                System.out.println("CPF:" + index.getCpf());
                System.out.println("Sexo:" + index.getSexo());
                System.out.println("Data de nascimento:" + index.getDataNascimento());
            }
        }
    }

    public static void listarEmpresa() {
        System.out.println("----Lista de empresas----");
        if (Empresa.empresas.isEmpty()) {
            System.out.println("Não contem empresas cadastradas!!");
        } else {
            for (Empresa index : Empresa.empresas) {
                System.out.println("nome da empresa: " + index.getNome());
                System.out.println("endereco: " + index.getEndereco());
                System.out.println("Data de cadastro: " + index.getDataCadastro());
                System.out.println("telefone: " + index.getTelefone());
                System.out.println("codigo do cliente: " + index.getCodigo());
                System.out.println("limite de credito: " + index.getLimiteCredito());
                System.out.println("CNPJ da empresa: " + index.getCnpj());
                System.out.println("inscrição estadual: " + index.getInscricaoEstadual());
                System.out.println("fundação da empresa: " + index.getDataFundacao());
            }
        }
    }
}
