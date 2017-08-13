package com.sridhar.db.dao.impl;


import com.sridhar.model.Flight;
import com.sridhar.db.dao.FlightDAO;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional
@Repository
public class EntityManagerFlightDAO implements FlightDAO{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Flight> getAllFlights() {
        String hql = "from Flight as flt";
        return (List<Flight>) entityManager.createQuery(hql).getResultList();
    }

    @Override
    public Flight getFlightById(String id) {
        return entityManager.find(Flight.class, id);
    }

    @Override
    public void addFlight(Flight flight) {
        entityManager.persist(flight);
    }

    @Override
    public void deleteFlight(Flight flight) {
        entityManager.remove(flight);
    }
}
