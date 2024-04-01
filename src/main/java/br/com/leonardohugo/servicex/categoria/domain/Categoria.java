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

    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    @EqualsAndHashCode.Include
    private Integer id;

    @Column(
            name = "nome",
            nullable = false
    )
    private String nome;

    @OneToMany(
            mappedBy = "categoria",
            cascade = CascadeType.ALL
    )
    private List<Servico> servicos;
}
