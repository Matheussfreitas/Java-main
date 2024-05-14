package ConversorMoedas;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Conversor meuConversor = new Conversor();
        meuConversor.menu();
        meuConversor.selecionarConversao();
    }
}
