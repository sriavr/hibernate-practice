package com.sridhar.db.dao;

import com.sridhar.model.Putana;
import java.util.List;

public interface PutanaDAO {
    List<Putana> getAllPutanas();
    Putana getPutanaById(String id);
    void addPutana(Putana flight);
    void deletePutana(Putana flight);
}
