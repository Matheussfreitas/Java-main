package Exercicios;

import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        int number;
        int divisor;
        int resultado;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vamos brincar de divisão");
        try {
            System.out.println("Digite um número: ");
            number = scanner.nextInt();
            System.out.println("Digite outro número: ");
            divisor = scanner.nextInt();
            resultado = number / divisor;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Aconteceu um erro aqui " + e.getMessage());
        }
    }
}
