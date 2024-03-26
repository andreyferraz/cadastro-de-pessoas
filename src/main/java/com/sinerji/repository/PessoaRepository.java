package com.sinerji.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import java.util.List;
import java.util.Optional;

import com.sinerji.model.PessoaModel;

public class PessoaRepository {
    
    @PersistenceContext
    private EntityManager em;

    public List<PessoaModel> findAll() {
        return em.createQuery("SELECT p FROM PessoaModel p", PessoaModel.class).getResultList();
    }

    public Optional<PessoaModel> findById(Long id) {
        PessoaModel pessoa = em.find(PessoaModel.class, id);
        return Optional.ofNullable(pessoa);
    }

    public PessoaModel save(PessoaModel pessoa) {
        if (pessoa.getId() == null) {
            em.persist(pessoa);
        } else {
            em.merge(pessoa);
        }
        return pessoa;
    }

    public void deleteById(Long id) {
        PessoaModel pessoa = em.find(PessoaModel.class, id);
        if (pessoa != null) {
            em.remove(pessoa);
        }
    }
}
