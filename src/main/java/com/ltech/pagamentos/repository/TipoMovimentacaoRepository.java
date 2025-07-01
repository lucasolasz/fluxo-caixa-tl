package com.ltech.pagamentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ltech.pagamentos.model.TipoMovimentacao;

public interface TipoMovimentacaoRepository extends JpaRepository<TipoMovimentacao, Long> {

}
