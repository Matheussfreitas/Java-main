package Exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaNumeros {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(8);
        lista.add(9);
        lista.add(10);
        lista.add(4);
        lista.add(3);
        lista.add(1);
        lista.add(7);
        lista.add(5);
        lista.add(2);
        lista.add(6);
        System.out.println("Lista de números: " + lista);
        Collections.sort(lista);
        System.out.println("Lista de números ordenada: " + lista);
    }
}
