package com.ltech.pagamentos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ltech.pagamentos.model.Lancamentos;
import com.ltech.pagamentos.padrao.CrudController;
import com.ltech.pagamentos.service.LancamentoService;

@Controller
@RequestMapping("/lancamentos")
public class LancamentoController extends CrudController<Lancamentos, Long, LancamentoService> {

    public LancamentoController(LancamentoService lancamentoService) {
        super("lancamentos", lancamentoService, "Lançamentos");
    }
}
