package com.watters.infrastructure.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by johnwatters on 07/05/2016.
 */
@Entity
@Table(name = "APPLICATION")
public class Application implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "APP_NAME")
    private String name;

    @OneToMany(fetch = FetchType.LAZY, targetEntity = DatabaseUser.class)
    @JoinColumn(name = "DATABASE_USER_ID")
    private List<DatabaseUser> databaseUsers = new ArrayList<DatabaseUser>();

    @ManyToOne
    @JoinColumn(name = "APP_SERVER_ID")
    private ApplicationServer applicationServer;

    @ManyToOne
    @JoinColumn(name = "VERSION_ID")
    private Version version;


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


    public List<DatabaseUser> getDatabaseUsers() {
        return databaseUsers;
    }

    public void setDatabaseUsers(List<DatabaseUser> databaseUsers) {
        this.databaseUsers = databaseUsers;
    }

    public ApplicationServer getApplicationServer() {
        return applicationServer;
    }

    public void setApplicationServer(ApplicationServer applicationServer) {
        this.applicationServer = applicationServer;
    }

    public Version getVersion() {
        return version;
    }

    public void setVersion(Version version) {
        this.version = version;
    }
}
