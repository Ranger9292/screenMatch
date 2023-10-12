package br.com.alura.screenmatch.modelos;

public class ErrorDeConversaoDeAnoException extends RuntimeException {
    private String mensagem;
    public ErrorDeConversaoDeAnoException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
