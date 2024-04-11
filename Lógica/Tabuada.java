import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe qual tabuada deseja imprimir");
        int multiplicando = scanner.nextInt();
        for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
            int resultado = multiplicando * multiplicador;
            System.out.println(String.format("%d X %d = %d", multiplicando, multiplicador, resultado));
        }
        scanner.close();
    }
}
