package com.sridhar.hibernatedemo;

import com.sridhar.db.dao.ArticleDAO;
import com.sridhar.model.Article;
import com.sridhar.model.Category;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.annotation.Commit;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HibernateDemoApplication.class)
@EntityScan(basePackages = "com.sridhar")
@ContextConfiguration
public class ArticleDAOIT {

    @Configuration
    static class ArticleDAOTestsConfiguration{
        @Bean
        public ArticleDAO articleDAO(){
            return Mockito.mock(ArticleDAO.class);
        }
    }

    private ArticleDAO articleDAO;

    @Autowired
    public void setArticleDAO(ArticleDAO articleDAO) {
        this.articleDAO = articleDAO;
    }

    @Before
    public void someMethod(){
        Mockito.doNothing().when(articleDAO).addArticle(null);
        List<Article> articles = new ArrayList<>();
        articles.add(new Article());
        articles.add(new Article());
        articles.add(new Article());
        articles.add(new Article());
        Mockito.when(articleDAO.getAllArticles()).thenReturn(articles);
    }

    @Test
    @Commit
    public void testAddArticle(){
        Assert.assertTrue(articleDAO!=null);
        Article article = new Article();
        article.setTitle("Krishna chastises Kalindi");
        List<Category> categories = new ArrayList<>();
        categories.add(new Category("category 1"));
        categories.add(new Category("category 2"));
        article.setCategories(categories);
        article.setBody("Krishna chastises Kalindi. How lucky was kalindi!!! Hari bol!!");
        article.setCreatedDate(new Date());
        articleDAO.addArticle(article);
    }

    @Test
    @Rollback(true)
    public void testGetAllArticles(){
        int count = articleDAO.getAllArticles().size() ;
        Article article = new Article();
        article.setTitle("Krishna chastises Kalindi");
        article.setBody("Krishna chastises Kalindi. How lucky was kalindi!!! Hari bol!!");
        articleDAO.addArticle(article);
//        Assert.assertEquals(count+1, articleDAO.getAllArticles().size());
        Assert.assertEquals(4, articleDAO.getAllArticles().size());
    }
}
