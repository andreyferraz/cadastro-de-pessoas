package com.sinerji.web;

import com.sinerji.model.PessoaModel;
import com.sinerji.services.PessoaService;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.util.List;

@Named
@RequestScoped
public class PessoaController {

    @Inject
    private PessoaService pessoaService;

    private List<PessoaModel> pessoas;

    @PostConstruct
    public void init() {
        pessoas = pessoaService.findAll();
    }


    public List<PessoaModel> getPessoas() {
        return pessoas;
    }
}
