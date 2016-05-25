package com.watters.infrastructure.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by johnwatters on 30/04/2016.
 */
@Entity
@Table(name = "ENVIRONMENT")
public class Environment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "ENV_NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;


    public Environment(String name) {
        this.name = name;

    }


    public Environment() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
