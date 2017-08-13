package com.sridhar.model;


import org.hibernate.annotations.GenericGenerator;
import org.springframework.core.annotation.Order;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "sys-uuid")
    @GenericGenerator(name="sys-uuid", strategy = "uuid")
    @Column(name = "article_id")
    private String articleId;

    @Column(name="title")
    private String title;

    @Column(name="body")
    private String body;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="created_date")
    private Date createdDate;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Category> categories;

    @OneToMany(cascade = CascadeType.ALL)
    @OrderBy("localKeywordId")
    private List<LocalKeyword> localKeywords;

    @ManyToOne(cascade = CascadeType.ALL)
    private ParentPage parentPage;

    public ParentPage getParentPage() {
        return parentPage;
    }

    public void setParentPage(ParentPage parentPage) {
        this.parentPage = parentPage;
    }

    public List<LocalKeyword> getLocalKeywords() {
        return localKeywords;
    }

    public void setLocalKeywords(List<LocalKeyword> localKeywords) {
        this.localKeywords = localKeywords;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
