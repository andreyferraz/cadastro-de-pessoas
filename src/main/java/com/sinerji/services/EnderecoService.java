package com.sinerji.services;

import com.sinerji.model.EnderecoModel;
import com.sinerji.repository.EnderecoRepository;

import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.util.List;
import java.util.Optional;

@Named
public class EnderecoService {

    @Inject
    private EnderecoRepository enderecoRepository;

    public List<EnderecoModel> findAll() {
        return enderecoRepository.findAll();
    }

    public Optional<EnderecoModel> findById(Long id) {
        return enderecoRepository.findById(id);
    }

    public EnderecoModel save(EnderecoModel endereco) {
        return enderecoRepository.save(endereco);
    }

    public void deleteById(Long id) {
        enderecoRepository.deleteById(id);
    }
}
