package com.demojpa.demo.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String prodName;

    @ManyToMany(mappedBy = "productsSet")
    private Set<Customers> customersSet;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public Set<Customers> getCustomersSet() {
        return customersSet;
    }

    public void setCustomersSet(Set<Customers> customersSet) {
        this.customersSet = customersSet;
    }
}
