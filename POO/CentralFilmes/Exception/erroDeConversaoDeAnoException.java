package poo.CentralFilmes.Exception;
//criação da classe excessão
public class ErroDeConversaoDeAnoException extends RuntimeException {
    private String mensagem;

    public ErroDeConversaoDeAnoException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override //sobrescrevendo a mensagem da excessão criada
    public String getMessage() {
        return this.mensagem;
    }
}
