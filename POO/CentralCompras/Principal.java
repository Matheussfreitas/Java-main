package poo.CentralCompras;

import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o limite do cartão: ");
        double limite = scanner.nextDouble();
        CartaoCredito cartao = new CartaoCredito(limite);

        int sair = 1;
        while (sair != 0) {
            System.out.println("Digite a descrição da compra: ");
            String nome = scanner.next();
            System.out.println("Digite o valor do produto: ");
            double valor = scanner.nextDouble();

            Compra compra = new Compra(nome, valor);
            boolean compraRealizada = cartao.LancaCompra(compra);

            if (compraRealizada) {
                System.out.println("Compra realizada!");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                sair = scanner.nextInt();
            } else {
                System.out.println("Saldo insuficiente!");
                sair = 0;
            }
        }

        System.out.println("------------------------");
        System.out.println("COMPRAS REALIZADAS:\n");

        Collections.sort(cartao.getCompra());
        for (Compra c : cartao.getCompra()) {
            System.out.println(c.getNome() + " - " +c.getValor());
        }
        System.out.println("\n------------------------");

        System.out.println("\nSaldo do cartão: " + cartao.getSaldo());
        }
    }

