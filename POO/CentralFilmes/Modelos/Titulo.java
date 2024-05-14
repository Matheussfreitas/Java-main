package poo.CentralFilmes.Modelos;

import com.google.gson.annotations.SerializedName;
import poo.CentralFilmes.Exception.ErroDeConversaoDeAnoException;

public class Titulo implements Comparable<Titulo> {
    //@SerializedName("Title") renomeando o parametro para a requisição na api
    private String nome;
    //@SerializedName("Year")
    private int anoLancamento;
    private int duracaoEmMinutos;
    private int totalDasAvaliacoes;
    private double somaDasAvaliacoes;
    private boolean incluidoPlano;

    public Titulo(String nome, int anoLancamento) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
    }

    public Titulo (TituloOmdb tituloOmdb) { //instanciando objeto para formatação de dados
        this.nome = tituloOmdb.title();
        if (tituloOmdb.year().length() > 4)
            throw new ErroDeConversaoDeAnoException("Não foi possível converter o ano, pois é inválido"); //criando a própria excessão para tratar o erro de formatação do ano
        this.anoLancamento = Integer.valueOf(tituloOmdb.year());
        this.duracaoEmMinutos = Integer.valueOf(tituloOmdb.runtime().substring(0, 3));
    }

    public void exibirFicha() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano do lançamento: " + anoLancamento);
        System.out.println("Duracao em minutos: " + getDuracaoEmMinutos());
        System.out.println("Média das avaliações: " + mediaDasAvaliacoes());
        System.out.println("Total das Avaliacoes: " + totalDasAvaliacoes);
        System.out.println("Incluido plano: " + incluidoPlano);
    }

    public void avalia(double nota) {
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

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() { //tratando a saida de dados na requisição da api
        return "(nome: " + nome + ", " + " ano de lancamento: " + anoLancamento + ", " + " duracao em minutos: " + duracaoEmMinutos + ")";
    }
}