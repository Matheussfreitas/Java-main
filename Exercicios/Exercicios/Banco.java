package Exercicios;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        String nome;
        String conta;
        double saldo;
        double transferencia;
        int operacao = 0;
        String tipoConta = """
            Selecione o tipo da conta: 
            1 - Conta Corrente
            2 - Conta Poupança
            """;
        String menu = """
            1 - Consultar saldo
            2 - Receber valor
            3 - Realizar transferência
            4 - Sair
            """;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira suas informações: ");
        System.out.println("Nome completo: ");
        nome = scanner.nextLine();
        System.out.println(tipoConta);
        conta = scanner.nextLine();
        if (conta.equals("1")) {
            conta = "Conta Corrente";
        } else {
            conta = "Conta Poupança";
        }
        System.out.println("Informe o valor do primeiro depósito: ");
        saldo = scanner.nextDouble();

        System.out.println("************************");
        System.out.println("\nNome: " + nome);
        System.out.println("Tipo da conta: " + conta);
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("\n************************");


        while (operacao != 4) {
            System.out.println("\nOperações:");
            System.out.println(menu);
            System.out.println("\nDigite o número da opção desejada: ");
            operacao = scanner.nextInt();
            switch (operacao) {
                case 1:
                    System.out.println("Seu saldo é de R$ " + saldo);
                    break;
                case 2:
                    System.out.println("Qual valor que deseja receber? ");
                    transferencia = scanner.nextDouble();
                    saldo += transferencia;
                    System.out.println("Seu novo saldo é de R$ " + saldo);
                    break;
                case 3:
                    System.out.println("Qual o valor da transferência que deseja realizar? ");
                    transferencia = scanner.nextDouble();
                    if (transferencia > saldo) {
                        System.out.println("Não há saldo suficiente para realizar a transferência");
                    } else {
                        saldo -= transferencia;
                        System.out.println("Seu novo saldo é de R$ " + saldo);
                    }
                    break;
                case 4:
                    System.out.println("Obrigado, volte sempre!");
                    break;
                default:
                    System.out.println("A opção selecionada não existe");
            }
        }
        scanner.close();
    }
}
