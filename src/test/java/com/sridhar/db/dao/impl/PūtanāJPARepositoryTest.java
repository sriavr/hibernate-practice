package com.sridhar.db.dao.impl;

import com.sridhar.hibernatedemo.HibernateDemoApplication;
import com.sridhar.model.Pūtanā;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = HibernateDemoApplication.class)
//@EntityScan(basePackages = "com.sridhar")
//@ContextConfiguration
//@Transactional
//class PūtanāJPARepositoryTest {
//    private PūtanāJPARepository pūtanāJPARepository;
//
//    @Autowired
//    public void setPūtanāJPARepository(PūtanāJPARepository pūtanāJPARepository) {
//        this.pūtanāJPARepository = pūtanāJPARepository;
//    }
//
//    @Test
//    public void testPutanaInsert(){
//        Pūtanā pūtanā = new Pūtanā();
//        pūtanā.setPhalaShruthi("ya etat pūtanā-mokṣaṁ\n" +
//                " kṛṣṇasyārbhakam adbhutam\n" +
//                "śṛṇuyāc chraddhayā martyo\n" +
//                " govinde labhate ratim");
//        pūtanāJPARepository.save(pūtanā);
//    }
//}