package com.sridhar.model;



import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="avatar")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Avatar {
    @Id
    @GeneratedValue
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    private Integer id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(updatable=false, nullable = false)
    public Date getBirthdate() { return birthdate; }
    public void setBirthdate(Date birthdate) { this.birthdate = birthdate; }
    private Date birthdate;
}
