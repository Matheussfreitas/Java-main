package POO.Filme;

public class FiltroRecomendacao {

    public void filtra(Classificavel classificavel) {
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Está entre os melhores");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Está bem avaliado no momento");
        } else {
            System.out.println("Coloque na lista para ver depois");
        }
    }
}
