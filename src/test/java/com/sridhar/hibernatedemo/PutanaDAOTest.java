package com.sridhar.hibernatedemo;

import com.sridhar.db.dao.PutanaDAO;
import com.sridhar.model.Putana;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HibernateDemoApplication.class)
@EntityScan(basePackages = "com.sridhar")
@ContextConfiguration
@Transactional
public class PutanaDAOTest {

    private PutanaDAO putanaDAO;

    @Autowired
    public void setPutanaDAO(PutanaDAO putanaDAO) {
        this.putanaDAO = putanaDAO;
    }

    @Test
    @Rollback(false)
    public void testAddArticle(){
        Assert.assertTrue(putanaDAO!=null);
        Putana putana = new Putana();
        putana.setPhalaShruthi("Hari bol");
        putana.setNama("Putana");
        putana.setGhāta("Bala ghataki");
        putanaDAO.addPutana(putana);
    }

}
