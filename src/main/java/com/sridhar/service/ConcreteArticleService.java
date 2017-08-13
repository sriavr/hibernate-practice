package com.sridhar.service;

import com.sridhar.db.dao.ArticleDAO;
import com.sridhar.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConcreteArticleService implements ArticleService{
    private ArticleDAO articleDAO;

    @Autowired
    public void setArticleDAO(ArticleDAO articleDAO) {
        this.articleDAO = articleDAO;
    }

    @Override
    public List<Article> getAllArticles() {
        return articleDAO.getAllArticles();
    }

    @Override
    public Article getArticleById(String id) {
        return articleDAO.getArticleById(id);
    }

    @Override
    public void addArticle(Article article) {
        articleDAO.addArticle(article);
    }

    @Override
    public void deleteArticle(Article article) {
        articleDAO.deleteArticle(article);
    }

    @Override
    public boolean articleExists(String title, String category) {
        return articleDAO.articleExists(title, category);
    }
}
