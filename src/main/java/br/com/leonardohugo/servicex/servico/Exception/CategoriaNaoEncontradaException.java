package br.com.leonardohugo.servicex.servico.Exception;

public class CategoriaNaoEncontradaException extends EntidadeNaoEncontradaException {
    public CategoriaNaoEncontradaException(String message) {
        super(message);
    }

    public CategoriaNaoEncontradaException(Integer id) {
        this("Categoria com id %d não existe".formatted(id));
    }
}



