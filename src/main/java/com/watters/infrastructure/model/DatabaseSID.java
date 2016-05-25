package com.watters.infrastructure.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by johnwatters on 07/05/2016.
 */
@Entity
@Table(name = "DATABASE_SID")
public class DatabaseSID implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "SID_NAME")
    private String name;

    @ManyToOne
    @JoinColumn(name = "DATABASE_ID")
    private Database database;


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

    public Database getDatabase() {
        return database;
    }

    public void setDatabase(Database database) {
        this.database = database;
    }
}
