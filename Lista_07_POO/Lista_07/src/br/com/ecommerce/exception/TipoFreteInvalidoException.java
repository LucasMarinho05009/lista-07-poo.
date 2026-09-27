package br.com.ecommerce.exception;

public class TipoFreteInvalidoException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    public TipoFreteInvalidoException(String mensagem) { super(mensagem); }
}
