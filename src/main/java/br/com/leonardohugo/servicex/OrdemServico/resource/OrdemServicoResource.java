package br.com.leonardohugo.servicex.OrdemServico.resource;

import br.com.leonardohugo.servicex.OrdemServico.domain.OrdemServico;
import br.com.leonardohugo.servicex.OrdemServico.service.OrdemServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(value = "/ordemservicos")
public class OrdemServicoResource {

    @Autowired
    private OrdemServicoService ordemServicoService;

    @PostMapping
    public ResponseEntity<OrdemServico> criarOS(@ResponseBody OrdemServico ordemServico) {
        ordemServico.criarOS(ordemServico);

        URI url = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand()(OrdemServicoService.getIdOrdemServico())
    }
}
}
