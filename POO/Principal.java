package POO;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "Top Gun";
        meuFilme.anoLancamento = 2021;
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(10);
        System.out.println(meuFilme.nome);
        System.out.println(meuFilme.anoLancamento);
        System.out.println(meuFilme.mediaDasAvaliacoes());
        System.out.println(meuFilme.gettotalDasAvaliacoes());
    }
}
