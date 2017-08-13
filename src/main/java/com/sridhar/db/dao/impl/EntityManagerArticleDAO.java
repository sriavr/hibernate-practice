package com.sridhar.db.dao.impl;


import com.sridhar.model.Article;
import com.sridhar.db.dao.ArticleDAO;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional
@Repository
public class EntityManagerArticleDAO implements ArticleDAO{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Article> getAllArticles() {
        String hql = "from Article as atcl";
        return (List<Article>) entityManager.createQuery(hql).getResultList();
    }

    @Override
    public Article getArticleById(String id) {
        return entityManager.find(Article.class, id);
    }

    @Override
    public void addArticle(Article article) {
        entityManager.persist(article);
    }

    @Override
    public void deleteArticle(Article article) {
        entityManager.remove(article);
    }

    @Override
    public boolean articleExists(String title, String category) {
        return false;
    }
}
