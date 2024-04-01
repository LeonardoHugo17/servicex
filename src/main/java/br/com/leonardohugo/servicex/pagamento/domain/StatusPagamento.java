package br.com.leonardohugo.servicex.pagamento.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum StatusPagamento {
    PENDENTE(1, "PENDENTE"),
    QUITADO(2, "QUITADO"),
    CANCELADO(3, "CANCELADO");

    private int cod;
    private String descricao;

    public static StatusPagamento toEnum(Integer cod){
        for(StatusPagamento pagamento : StatusPagamento.values()){
            if(cod.equals(pagamento.cod)){
                return pagamento;
            }
        }
        throw new IllegalArgumentException("Código Inválido"+cod);
    }
}
