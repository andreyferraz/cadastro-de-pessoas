package com.sinerji.repository;

import com.sinerji.model.EnderecoModel;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

public class EnderecoRepository {

    @PersistenceContext
    private EntityManager em;

    public List<EnderecoModel> findAll() {
        return em.createQuery("SELECT e FROM EnderecoModel e", EnderecoModel.class).getResultList();
    }

    public Optional<EnderecoModel> findById(Long id) {
        EnderecoModel endereco = em.find(EnderecoModel.class, id);
        return Optional.ofNullable(endereco);
    }

    public EnderecoModel save(EnderecoModel endereco) {
        if (endereco.getId() == null) {
            em.persist(endereco);
        } else {
            em.merge(endereco);
        }
        return endereco;
    }

    public void deleteById(Long id) {
        EnderecoModel endereco = em.find(EnderecoModel.class, id);
        if (endereco != null) {
            em.remove(endereco);
        }
    }
}
