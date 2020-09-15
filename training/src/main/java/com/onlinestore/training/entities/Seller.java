package com.onlinestore.training.entities;

import javax.persistence.*;
@Entity
@Table(name = "seller")
public class Seller {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "idseller")
    private Long idSeller;
    @Column(name = "codvende")
    private Long codvende;
    @Column(name = "firstname")
    private String firstName;
    @Column(name = "lastname")
    private String lastName;
    @Column(name = "age")
    private int age;

    public Long getIdSeller() {
        return idSeller;
    }

    public void setIdSeller(Long idSeller) {
        this.idSeller = idSeller;
    }

    public Long getCodvende() {
        return codvende;
    }

    public void setCodvende(Long codvende) {
        this.codvende = codvende;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
