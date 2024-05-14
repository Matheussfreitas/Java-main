package poo.CentralFilmes.Principal;

import poo.CentralFilmes.Modelos.Filme;
import poo.CentralFilmes.Modelos.Serie;
import poo.CentralFilmes.Modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme godzilla = new Filme("Godzilla", 2014);
        Filme topGun = new Filme("Top Gun Maverick", 2022);
        Filme forrest = new Filme("Forrest Gump", 1994);
        Serie lost = new Serie("Lost", 2004);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(topGun);
        lista.add(godzilla);
        lista.add(forrest);
        lista.add(lost);
        System.out.println("Tamanho da lista: " + lista.size());
        System.out.println("Filme selecionado: " + lista.get(1).getNome());
        for (Titulo item : lista) {
            System.out.println(item);
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }
        Collections.sort(lista); //ordenada por nome do item na lista
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoLancamento)); //ordenada pela ano do item na lista
        System.out.println(lista);

        System.out.println("------------------");

        List<String> buscaArtista = new ArrayList<>(); //utilizando interface List
        buscaArtista.add("Tom Cruise");
        buscaArtista.add("Tom Hanks");
        buscaArtista.add("Matheus Freitas");
        buscaArtista.add("Cristiano Ronaldo");
        Collections.sort(buscaArtista);
        System.out.println(buscaArtista);
    }
}
