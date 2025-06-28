package com.ltech.pagamentos.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Lancamentos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime dataLancamento;

    @Column(length = 255)
    private String descricao;

    @ManyToOne
    private Usuario funcionarioLancamento;

    @ManyToOne
    private TipoMovimentacao tipoMovimentacao;

    @ManyToOne
    private FundoFinanceiro fundoFinanceiro;

}
