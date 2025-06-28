package com.ltech.pagamentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ltech.pagamentos.model.Lancamentos;

public interface LancamentoRepository extends JpaRepository<Lancamentos, Long> {

}
