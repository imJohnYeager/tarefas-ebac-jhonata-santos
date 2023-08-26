package br.jyeager.exceptions;

public class TipoChaveNaoEncontradaException extends Exception {

    private static final long serialVersionUID = -2658796584102502536L;

    public TipoChaveNaoEncontradaException(String msg) {
        this(msg, null);
    }

    public TipoChaveNaoEncontradaException(String msg, Throwable e) {
        super(msg, e);
    }
}