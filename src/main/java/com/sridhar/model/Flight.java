package com.sridhar.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TBL_FLIGHT", uniqueConstraints = @UniqueConstraint(name ="flight_number",
columnNames = {"comp_prefix", "flight_number"}))
public class Flight implements Serializable {
    private String companyPrefix;

    private String number;

    private String id;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "sys-uuid")
    @GenericGenerator(name="sys-uuid", strategy = "uuid")
    @Column(name="id")
    public String getId(){return id;}

    @Column(name="comp_prefix")
    public String getCompanyPrefix() { return companyPrefix; }

    @Column(name="flight_number")
    public String getNumber() { return number; }

    public void setCompanyPrefix(String companyPrefix) {
        this.companyPrefix = companyPrefix;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setId(String id) {
        this.id = id;
    }
}


