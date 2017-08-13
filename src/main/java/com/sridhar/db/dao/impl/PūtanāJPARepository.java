package com.sridhar.db.dao.impl;

import com.sridhar.model.Pūtanā;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface PūtanāJPARepository extends CrudRepository<Pūtanā, Long>
{
}
