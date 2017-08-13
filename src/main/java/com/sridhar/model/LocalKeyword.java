package com.sridhar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class LocalKeyword {

    @Id
    @Column
    @GeneratedValue
    private long keywordId;

    @Column
    private String keywordName;

    public LocalKeyword(String keywordName) {
        this.keywordName = keywordName;
    }

    public long getKeywordId() {
        return keywordId;
    }

    public void setKeywordId(long keywordId) {
        this.keywordId = keywordId;
    }
}
