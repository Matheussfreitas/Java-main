package POO.CentralAudio;

public class Musica extends Audio {
    private String artista;
    private String album;
    private String genero;

    public void fichaTecnica(Musica musica) {
        System.out.println("Nome: " + getTitulo());
        System.out.println("Artista: " + getArtista());
        System.out.println("Albúm: " + getAlbum());
        System.out.println("Gênero: " + getGenero());
        System.out.println("Duração: " + getDuracao());
        System.out.println("Total de curtidas: " + getTotalCurtidas());
        System.out.println("Total de reproduções: " + getTotalReproducoes());
        System.out.println("Classificação: " + getClassificacao()/2 + " estrelas");
    }

    //getters e setters

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalCurtidas() > 1000) {
            return 10;
        } else {
            return 7;
        }
    }
}
