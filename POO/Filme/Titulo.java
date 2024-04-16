package POO.Filme;

public class Titulo {
    private String nome;
    private int anoLancamento;
    private int duracaoEmMinutos;
    private int totalDasAvaliacoes;
    private double somaDasAvaliacoes;
    private boolean incluidoPlano;

    void exibirFicha() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano do lançamento: " + anoLancamento);
        System.out.println("Duracao em minutos: " + getDuracaoEmMinutos());
        System.out.println("Média das avaliações: " + mediaDasAvaliacoes());
        System.out.println("Total das Avaliacoes: " + totalDasAvaliacoes);
        System.out.println("Incluido plano: " + incluidoPlano);
    }

    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDasAvaliacoes++;
    }

    double mediaDasAvaliacoes() {
        return somaDasAvaliacoes / totalDasAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getTotalDasAvaliacoes() {
        return totalDasAvaliacoes;
    }

    public void setTotalDasAvaliacoes(int totalDasAvaliacoes) {
        this.totalDasAvaliacoes = totalDasAvaliacoes;
    }

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public void setSomaDasAvaliacoes(double somaDasAvaliacoes) {
        this.somaDasAvaliacoes = somaDasAvaliacoes;
    }

    public boolean getIncluidoPlano() {
        return incluidoPlano;
    }

    public void setIncluidoPlano(boolean incluidoPlano) {
        this.incluidoPlano = incluidoPlano;
    }


}
