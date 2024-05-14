package poo.CentralAudio;

public class Preferencias {
    public void inclui(Audio audio) {
        if (audio.getClassificacao() > 8) {
            System.out.println(audio.getTitulo() + ": Está nas tops do momento");
        } else {
            System.out.println(audio.getTitulo() + ": É uma boa escolha");
        }
    }
}
