package com.sridhar.service;


import com.sridhar.model.Article;

import java.util.List;

public interface ArticleService {
    List<Article> getAllArticles();
    Article getArticleById(String id);
    void addArticle(Article article);
    void deleteArticle(Article article);
    boolean articleExists(String title, String category);
}
