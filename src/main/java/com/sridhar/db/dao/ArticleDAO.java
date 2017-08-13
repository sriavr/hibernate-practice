package com.sridhar.db.dao;

import com.sridhar.model.Article;

import java.util.List;

public interface ArticleDAO {
    List<Article> getAllArticles();
    Article getArticleById(String id);
    void addArticle(Article article);
    void deleteArticle(Article article);
    boolean articleExists(String title, String category);
}
