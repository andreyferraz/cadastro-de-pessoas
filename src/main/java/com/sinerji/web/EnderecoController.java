package com.sinerji.web;

import com.sinerji.model.EnderecoModel;
import com.sinerji.services.EnderecoService;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.util.List;

@Named
@RequestScoped
public class EnderecoController {

    @Inject
    private EnderecoService enderecoService;

    private List<EnderecoModel> enderecos;

    @PostConstruct
    public void init() {
        enderecos = enderecoService.findAll();
    }

    // Métodos para CRUD
    // ...

    public List<EnderecoModel> getEnderecos() {
        return enderecos;
    }
}
