package br.com.leonardohugo.servicex.OrdemServico.repository;

import br.com.leonardohugo.servicex.OrdemServico.domain.OrdemServico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdemServicoRepository extends JpaRepository<OrdemServico, Integer> {
}
