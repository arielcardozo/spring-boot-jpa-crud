package com.crud.spring.datajpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "marital_status")
public class MaritalStatus implements Serializable {

    @Id
    private long id;

    @Column(name = "name")
    private String name;

    public MaritalStatus(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public MaritalStatus() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MaritalStatus{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
