package com.watters.infrastructure.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by johnwatters on 07/05/2016.
 */
@Entity
@Table(name = "DATABASE_USER")
public class DatabaseUser implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "USER_NAME")
    private String name;

    @ManyToOne
    @JoinColumn(name = "DATABASE_SID_ID")
    private DatabaseSID databaseSID;


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

    public DatabaseSID getDatabaseSID() {
        return databaseSID;
    }

    public void setDatabaseSID(DatabaseSID databaseSID) {
        this.databaseSID = databaseSID;
    }
}
