package com.sridhar.db.dao.impl;

import com.sridhar.db.dao.PutanaDAO;
import com.sridhar.model.Putana;
import com.sridhar.model.Putana;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional
@Repository
public class EntityManagerPutanaDAO implements PutanaDAO {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Putana> getAllPutanas() {
        String hql = "from Putana as ptn";
        return (List<Putana>) entityManager.createQuery(hql).getResultList();
    }

    @Override
    public Putana getPutanaById(String id) {
        return entityManager.find(Putana.class, id);
    }

    @Override
    public void addPutana(Putana flight) {
        entityManager.persist(flight);
    }

    @Override
    public void deletePutana(Putana flight) {
        entityManager.remove(flight);
    }
}