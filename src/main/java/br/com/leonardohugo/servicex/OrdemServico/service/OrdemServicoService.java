package br.com.leonardohugo.servicex.OrdemServico.service;

import br.com.leonardohugo.servicex.OrdemServico.repository.OrdemServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdemServicoService {

    @Autowired
    private OrdemServicoRepository ordemServicoRepository;
}
