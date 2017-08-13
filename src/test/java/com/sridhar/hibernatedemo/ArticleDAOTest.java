package com.sridhar.hibernatedemo;

import com.sridhar.db.dao.ArticleDAO;
import com.sridhar.model.Article;
import com.sridhar.model.Category;
import com.sridhar.model.LocalKeyword;
import com.sridhar.model.ParentPage;
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

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HibernateDemoApplication.class)
@EntityScan(basePackages = "com.sridhar")
@ContextConfiguration
@Transactional
public class ArticleDAOTest {

    private ArticleDAO articleDAO;

    @Autowired
    public void setArticleDAO(ArticleDAO articleDAO) {
        this.articleDAO = articleDAO;
    }

    @Test
    @Rollback(false)
    public void testAddArticle(){
        Assert.assertTrue(articleDAO!=null);
        Article article = new Article();
        article.setTitle("Krishna chastises Kalindi");
        List<Category> categories = new ArrayList<>();
        categories.add(new Category("category 1"));
        categories.add(new Category("category 2"));
        article.setCategories(categories);

        List<LocalKeyword> localKeywords = new ArrayList<>();
        localKeywords.add(new LocalKeyword("keyword 1"));
        localKeywords.add(new LocalKeyword("keyword 2"));
        article.setLocalKeywords(localKeywords);

        ParentPage parentPage = new ParentPage("parent1");
        article.setParentPage(parentPage);

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
        article.setCreatedDate(new Date());
        articleDAO.addArticle(article);
        Assert.assertEquals(count+1, articleDAO.getAllArticles().size());
    }
}
