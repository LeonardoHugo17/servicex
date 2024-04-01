package br.com.leonardohugo.servicex.servico.domain;

import br.com.leonardohugo.servicex.OrdemServico.domain.OrdemServico;
import br.com.leonardohugo.servicex.categoria.domain.Categoria;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "SERVICOS")
public class Servico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_SERVICO")
    private Integer idServico;

    @Column(name = "NOME_SERVICO")
    private Integer nomeServico;

    @Column(name = "VALOR_SERVICO")
    private Double valor;

    @ManyToOne
    @JoinColumn(name = "idCategoria")
    private Categoria categoria;
    @ManyToMany
    private List<OrdemServico> ordemServicos;
}

