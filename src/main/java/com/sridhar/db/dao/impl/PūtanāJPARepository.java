package com.sridhar.db.dao.impl;

import com.sridhar.model.Putana;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface PūtanāJPARepository extends CrudRepository<Putana, Long>
{
}
