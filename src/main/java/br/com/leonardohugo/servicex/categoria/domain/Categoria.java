package br.com.leonardohugo.servicex.categoria.domain;

import br.com.leonardohugo.servicex.servico.domain.Servico;
import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(
        name = "CATEGORIA"
)
@Data
@EqualsAndHashCode (
        onlyExplicitlyIncluded = true
)
@NoArgsConstructor
public class Categoria {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CATEGORIA")
    private Integer idCategoria;

    @Column(name = "NOME_CATEGORIA")
    private String nomeCategoria;

    @OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
    private List<Servico> servicos;

}
