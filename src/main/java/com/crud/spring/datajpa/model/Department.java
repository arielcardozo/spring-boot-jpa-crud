package com.crud.spring.datajpa.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "department")
    public class Department implements Serializable
{
    @Id
    private long id;

    @Column(name = "name")
    private String name;

    public long getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName( )
    {
        return name;
    }

    public void setName( String deptName )
    {
        this.name = deptName;
    }

    public Department() {
    }

    public Department(String name) {
        this.name = name;
    }

    public Department(long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
