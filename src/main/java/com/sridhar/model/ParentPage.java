package com.sridhar.model;

import javax.persistence.*;

@Entity
public class ParentPage {
    @Column
    @Id
    @GeneratedValue
    private long parentPageId;

    @Column
    private String name;

    public ParentPage(String name) {
        this.name = name;
    }

    public ParentPage() {
    }
}
