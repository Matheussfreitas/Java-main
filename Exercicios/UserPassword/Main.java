package UserPassword;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Usuario usuario = new Usuario("", "000000000");
        try {
            System.out.println("Digite seu usuário: ");
            usuario.setUser(scanner.nextLine());
            System.out.println("Digite sua senha: ");
            usuario.setPassword(scanner.nextLine());
            System.out.println("Dados de login: ");
            System.out.println("Usuário: " + usuario.getUser() + "Senha: " + usuario.getPassword());
        } catch (SenhaInvalidaException e) {
            System.out.println(e.getMessage());
        }
    }
}
