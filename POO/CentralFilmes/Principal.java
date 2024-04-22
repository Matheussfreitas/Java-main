package POO.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme topGun = new Filme();
        topGun.setNome("Top Gun");
        topGun.setAnoLancamento(2021);
        topGun.setDuracaoEmMinutos(180);
        topGun.setIncluidoPlano(true);
        topGun.avalia(8);
        topGun.avalia(10);
        topGun.avalia(10);
        topGun.exibirFicha();

        System.out.println();

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoLancamento(2000);
        lost.setTemporadas(6);
        lost.setMinutosPorEpisodio(40);
        lost.setEpisodiosPorTemporada(23);
        lost.setAtiva(false);
        lost.setIncluidoPlano(true);
        lost.avalia(10);
        lost.avalia(9.5);
        lost.avalia(9);
        lost.exibirFicha();

        System.out.println();

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(lost);
        calculadora.inclui(topGun);
        System.out.println("Tempo necessário: " + calculadora.getTempoTotal());

        System.out.println();

        System.out.println("Série: " + topGun.getNome());
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(topGun);
    }
}
