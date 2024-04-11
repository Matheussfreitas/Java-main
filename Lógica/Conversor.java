import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Informe o valor em °C: ");
        double celsius = myObj.nextInt();
        double fahrenheit = (celsius * 1.8) + 32;
        int intFah = (int) fahrenheit;
        int intCel = (int) celsius;
        System.out.println(String.format("A temperatura de %.1f°C é equivalente a %.1f°F", celsius, fahrenheit));
        System.out.println(String.format("O valor inteiro da temperatura %d°C é equivalente a %d°F", intCel, intFah));
        myObj.close();
    }
}
