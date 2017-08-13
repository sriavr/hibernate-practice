package com.sridhar.model;

import org.springframework.cglib.core.GeneratorStrategy;

import javax.persistence.*;

/*
Single table per class hierarchy strategy: a single table hosts all the instances of a class hierarchy
 */
@Entity
@DiscriminatorValue("Rakshasi")
public class Rakshasi {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String ghata;

    @Column
    private String nama;

    public String getGhāta() {
        return ghata;
    }

    public void setGhāta(String ghāta) {
        this.ghata = ghāta;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
