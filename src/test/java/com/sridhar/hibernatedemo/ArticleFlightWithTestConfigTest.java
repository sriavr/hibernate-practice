package com.sridhar.hibernatedemo;


import com.sridhar.db.dao.ArticleDAO;
import com.sridhar.db.dao.FlightDAO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import spring.config.TestConfig;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestConfig.class)
public class ArticleFlightWithTestConfigTest {
    private FlightDAO flightDAO;

    private ArticleDAO articleDAO;

    @Autowired
    public void setFlightDAO(FlightDAO flightDAO) {
        this.flightDAO = flightDAO;
    }

    @Autowired
    public void setArticleDAO(ArticleDAO articleDAO){
        this.articleDAO = articleDAO;
    }

    @Test
    public void testGetAllFlights(){
        Assert.assertTrue(flightDAO.getAllFlights().size() == 3);
    }

    @Test
    public void testGetAllArticles(){
        Assert.assertTrue(articleDAO.getAllArticles().size() == 2);
    }
}
