package POO;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Filme meuFilme = new Filme();
        meuFilme.nome = scanner.nextLine();
        meuFilme.somaDasAvaliacoes = scanner.nextInt();
        scanner.close();
        System.out.println(meuFilme.nome);
    }
}
