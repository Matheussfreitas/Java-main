package POO;

public class Filme {
    String nome;
    int anoLancamento;
    int minutos;
    int totalDasAvaliacoes;
    double somaDasAvaliacoes;
    boolean incluidoPlano;

    void exibirFicha() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano do lançamento: " + anoLancamento);
    }
    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDasAvaliacoes++;
    }
    double mediaDasAvaliacoes() {
        return somaDasAvaliacoes / totalDasAvaliacoes;
    }
}
