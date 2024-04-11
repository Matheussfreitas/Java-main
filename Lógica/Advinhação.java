import java.util.Random;
import java.util.Scanner;


public class Advinhação {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroSecreto = new Random().nextInt(100);
        int tentativas = 1;
        int tentativa = 0;
        System.out.println("Esse é o jogo do número secreto");
        System.out.println("Digite um número entre 1 e 100");
        
        while (tentativa != numeroSecreto) {
            tentativa = scanner.nextInt();
            if (tentativa > numeroSecreto) {
                System.out.println("O número secreto é menor");
                tentativas++;
            } if (tentativa < numeroSecreto) {
                System.out.println("O número secreto é maior");
                tentativas++;
            } if (tentativa == numeroSecreto) {
                System.out.println("Você acertou o número secreto!");
            }
        }
        System.out.println(String.format("Número secreto: %d / Tentativas: %d", numeroSecreto, tentativas));
        scanner.close();
    }
}
