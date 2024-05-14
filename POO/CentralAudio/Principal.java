package poo.CentralAudio;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("FFM");
        minhaMusica.setArtista("Filipe Ret");
        minhaMusica.setAlbum("Imaterial");
        minhaMusica.setGenero("Rap");
        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }
        for (int i = 0; i < 1001; i++) {
            minhaMusica.curte();
        }
        Preferencias minhaPreferencia = new Preferencias();
        minhaMusica.fichaTecnica(minhaMusica);
        minhaPreferencia.inclui(minhaMusica);

        System.out.println();

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Muzycast");
        meuPodcast.setApresentador("Paulo Muzy");
        meuPodcast.setDescricao("O MuzyCast é um espaço de bate-papo enquanto faço aeróbico após o meu treino diário, aqui falamos sobre um pouco de tudo, o que você tiver dúvida, discutimos sobre.");
        for (int i = 0; i < 500; i++) {
            meuPodcast.reproduz();
        }
        for (int i = 0; i < 100; i++) {
            meuPodcast.curte();
        }
        meuPodcast.fichaTecnica(meuPodcast);
        minhaPreferencia.inclui(meuPodcast);
    }
}
