package br.com.leonardohugo.servicex.servico.Exception;

public class ServicoNaoEncontradoException extends EntidadeNaoEncontradaException{

    public ServicoNaoEncontradoException(String message) {
        super(message);
    }

    public ServicoNaoEncontradoException(Integer id) {
        this("Serviço com id %d não existe".formatted(id));
    }
}