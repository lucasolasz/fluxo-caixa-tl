package com.ltech.pagamentos.service;

import org.springframework.stereotype.Service;

import com.ltech.pagamentos.model.TipoMovimentacao;
import com.ltech.pagamentos.padrao.ServiceCrud;
import com.ltech.pagamentos.repository.TipoMovimentacaoRepository;

@Service
public class TipoMovimentacaoService extends ServiceCrud<TipoMovimentacao, Long, TipoMovimentacaoRepository> {

    public TipoMovimentacaoService(TipoMovimentacaoRepository repository) {
        super(repository);
    }

}
