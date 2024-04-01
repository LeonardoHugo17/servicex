package br.com.leonardohugo.servicex.servico.service;

import br.com.leonardohugo.servicex.servico.Exception.ServicoNaoEncontradoException;
import br.com.leonardohugo.servicex.servico.domain.Servico;
import br.com.leonardohugo.servicex.servico.repository.ServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Servicoservice {

    @Autowired
    private ServicoRepository servicoRepository;


    public List<Servico> listarServicos() {
        return servicoRepository.findAll();
    }

    public Servico procurarServico(Integer servicoId) {
        return servicoRepository.findById(servicoId)
                .orElseThrow(() -> new ServicoNaoEncontradoException(servicoId));
    }

    public Servico salvarServico(Servico servico) {
        return servicoRepository.save(servico);
    }

    public void deletarServico(Integer categoriaId) {
        Servico servico = procurarServico(categoriaId);

        servicoRepository.delete(servico);
    }
}
