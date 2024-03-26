package com.sinerji.services;

import com.sinerji.model.PessoaModel;
import com.sinerji.repository.PessoaRepository;

import java.util.List;
import java.util.Optional;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
public class PessoaService {

    @Inject
    private PessoaRepository pessoaRepository;

    public List<PessoaModel> findAll() {
        return pessoaRepository.findAll();
    }

    public Optional<PessoaModel> findById(Long id) {
        return pessoaRepository.findById(id);
    }

    public PessoaModel save(PessoaModel pessoa) {
        return pessoaRepository.save(pessoa);
    }

    public void deleteById(Long id) {
        pessoaRepository.deleteById(id);
    }
}
