package UserPassword;

public class SenhaInvalidaException extends RuntimeException {
    private String mensagem;

    public SenhaInvalidaException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() { //sobrescreve a mensagem da exception
        return this.mensagem;
    }
}
