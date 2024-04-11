import java.util.Scanner;

public class soma {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Entre com o valor de dois números inteiros: ");
        
        int num1 = myObj.nextInt();
        int num2 = myObj.nextInt();
        int resultado = num1 + num2;
        
        System.out.println("O resultado da soma dos números é: " + resultado);
    }
}