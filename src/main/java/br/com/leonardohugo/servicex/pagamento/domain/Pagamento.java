package br.com.leonardohugo.servicex.pagamento.domain;

import br.com.leonardohugo.servicex.OrdemServico.domain.OrdemServico;
import jakarta.persistence.*;

@Entity
@Table(name = "PAGAMENTO")
public class Pagamento {

    @Id
    private Integer idPagamento;
    @Column(name = "STATUS_PAGAMENTO")
    private Integer statusPagamento;
    @OneToOne
    @JoinColumn(name = "ID_OS")
    @MapsId
    private OrdemServico ordemServico;

    public Pagamento(Integer idPagamento, StatusPagamento statusPagamento, OrdemServico ordemServico){
        this.idPagamento = idPagamento;
        this.statusPagamento = (statusPagamento == null) ? null : statusPagamento.getCod();
        this.ordemServico = ordemServico;
    }

    public Integer getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(Integer idPagamento) {
        this.idPagamento = idPagamento;
    }

    public StatusPagamento getStatusPagamento() {
        return StatusPagamento.toEnum(statusPagamento);
    }

    public void setStatusPagamento(Integer statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    public OrdemServico getOrdemServico() {
        return ordemServico;
    }

    public void setOrdemServico(OrdemServico ordemServico) {
        this.ordemServico = ordemServico;
    }
}
