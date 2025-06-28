package com.ltech.pagamentos.service;

import org.springframework.stereotype.Service;

import com.ltech.pagamentos.model.Lancamentos;
import com.ltech.pagamentos.padrao.ServiceCrud;
import com.ltech.pagamentos.repository.LancamentoRepository;

@Service
public class LancamentoService extends ServiceCrud<Lancamentos, Long, LancamentoRepository> {

    public LancamentoService(LancamentoRepository repository) {
        super(repository);
    }

}
