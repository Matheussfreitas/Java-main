package POO.Filme;

public class Episodio implements Classificavel{
    private String nome;
    private int numero;
    private Serie serie;
    private int totalVisualiazacoes;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao() {
        if (totalVisualiazacoes > 200) {
            return 4;
        } else {
            return 3;
        }
    }
}
