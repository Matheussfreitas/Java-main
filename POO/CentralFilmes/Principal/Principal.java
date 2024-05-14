package poo.CentralFilmes.Principal;

import poo.CentralFilmes.Calculos.CalculadoraDeTempo;
import poo.CentralFilmes.Calculos.FiltroRecomendacao;
import poo.CentralFilmes.Modelos.Filme;
import poo.CentralFilmes.Modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme topGun = new Filme("Top Gun Maverick", 2022);
        topGun.setDuracaoEmMinutos(180);
        topGun.setIncluidoPlano(true);
        topGun.avalia(8);
        topGun.avalia(10);
        topGun.avalia(10);
        topGun.exibirFicha();

        System.out.println("------------------");

        Filme godzilla = new Filme("Godzilla", 2014);
        godzilla.setDuracaoEmMinutos(180);
        godzilla.setIncluidoPlano(true);
        godzilla.avalia(8);
        godzilla.avalia(7);
        godzilla.avalia(8.5);
        godzilla.exibirFicha();

        System.out.println("------------------");

        Serie lost = new Serie("Lost", 2004);
        lost.setTemporadas(6);
        lost.setMinutosPorEpisodio(40);
        lost.setEpisodiosPorTemporada(23);
        lost.setAtiva(false);
        lost.setIncluidoPlano(true);
        lost.avalia(10);
        lost.avalia(9.5);
        lost.avalia(9);
        lost.exibirFicha();

        System.out.println("------------------");

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(lost);
        calculadora.inclui(topGun);
        System.out.println("Calculadora de tempo:");
        System.out.println("O tempo necessário para maratonar os títulos selecionados é de " + calculadora.getTempoTotal());

        System.out.println("------------------");

        System.out.println("Série: " + lost.getNome());
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(lost);

        System.out.println("------------------");

        ArrayList<Filme> listaFilmes = new ArrayList<>();
        listaFilmes.add(topGun);
        listaFilmes.add(godzilla);
        System.out.println("Tamanho da lista: " + listaFilmes.size());
        System.out.println("Filme selecionado: " + listaFilmes.get(1).getNome());
        System.out.println(listaFilmes);
    }
}
