package Exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaNomes implements Comparable<ListaNomes> {
    private String nome;

    public String getNome() {
        return nome;
    }

    public ListaNomes(String nome) { //instancia o nome do objeto na criação do próprio objeto
        this.nome = nome;
    }

    @Override
    public String toString() { //retorna o nome do objeto na lista
        return getNome();
    }

    @Override
    public int compareTo(ListaNomes o) { //implementação da interface Compareble para ordenar objetos em uma lista
        return getNome().compareTo(o.getNome());
    }

    public static void main(String[] args) {
        List<ListaNomes> lista = new ArrayList<>();
        ListaNomes matheus = new ListaNomes("Matheus"); //passando nomes como parâmetro
        ListaNomes mariana = new ListaNomes("Mariana");
        ListaNomes hebert = new ListaNomes("Hebert");
        ListaNomes joao = new ListaNomes("João");
        lista.add(matheus); //adicionando objetos a lista
        lista.add(mariana);
        lista.add(hebert);
        lista.add(joao);
        System.out.println("Lista de nomes: " + lista);
        Collections.sort(lista);
        System.out.println("Lista de nomes ordenada: " + lista);
    }
}
