package com.sridhar.model;


import javax.persistence.*;

/*
Single table per class hierarchy strategy: a single table hosts all the instances of a class hierarchy
 */
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Entity
@DiscriminatorColumn(name ="RakshasiType", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("Putana")
public class Putana extends Rakshasi{

    @Column
    private String phalaShruthi;

    public String getPhalaShruthi() {
        return phalaShruthi;
    }

    public void setPhalaShruthi(String phalaShruthi) {
        this.phalaShruthi = phalaShruthi;
    }
}
