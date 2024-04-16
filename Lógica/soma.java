import java.util.Scanner;

public class soma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o valor de dois números inteiros: ");
        
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int resultado = num1 + num2;
        scanner.close();
        
        System.out.println("O resultado da soma dos números é: " + resultado);
    }
}