package poo.CentralAudio;

public class Podcast extends Audio {
    private String apresentador;
    private String descricao;

    public void fichaTecnica(Podcast podcast) {
        System.out.println("Nome: " + getTitulo());
        System.out.println("Apresentador: " + getApresentador());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Duração: " + getDuracao());
        System.out.println("Total de curtidas: " + getTotalCurtidas());
        System.out.println("Total de reproduções: " + getTotalReproducoes());
        System.out.println("Classificação: " + getClassificacao()/2 + " estrelas");
    }

    //getters e setters

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalCurtidas() > 500) {
            return 10;
        } else {
            return 7;
        }
    }
}
