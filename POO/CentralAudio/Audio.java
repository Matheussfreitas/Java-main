package poo.CentralAudio;

public class Audio {
    private String titulo;
    private int duracao;
    private int totalCurtidas;
    private int totalReproducoes;
    private int classificacao;

    //métodos void

    public void fichaTecnica() {
        System.out.println("Nome: " + titulo);
        System.out.println("Duração: " + duracao);
        System.out.println("Total de curtidas: " + totalCurtidas);
        System.out.println("Total de reproduções: " + totalReproducoes);
        System.out.println("Classificação: " + getClassificacao()/2 + " estrelas");
    }

    public void curte() {
        totalCurtidas++;
    }
    public void reproduz() {
        totalReproducoes++;
    }

    //getters e setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getClassificacao() {
        return classificacao;
    }
}
