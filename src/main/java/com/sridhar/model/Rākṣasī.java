package com.sridhar.model;

import org.springframework.cglib.core.GeneratorStrategy;

import javax.persistence.*;

/*
Single table per class hierarchy strategy: a single table hosts all the instances of a class hierarchy
 */
@Entity
@DiscriminatorValue("Rākṣasī")
public class Rākṣasī {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String ghāta;

    @Column
    private String nama;

    public String getGhāta() {
        return ghāta;
    }

    public void setGhāta(String ghāta) {
        this.ghāta = ghāta;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
