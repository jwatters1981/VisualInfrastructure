package com.watters.infrastructure.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by johnwatters on 06/05/2016.
 */
@Entity
@Table(name = "DATA_BASE")
public class Database implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "DB_NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @OneToOne
    @JoinColumn(name = "VERSION_ID")
    private Version version;

    @ManyToOne
    @JoinColumn(name = "DATABASE_SERVER_ID")
    private DatabaseServer databaseServer;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "database")
    private List<DatabaseSID> databaseSIDs = new ArrayList<DatabaseSID>();

    public Database() {
    }

    public Database(Version version, String name, String description, DatabaseServer databaseServer) {
        this.name = name;
        this.description = description;
        this.version = version;
        this.databaseServer = databaseServer;
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


    public Version getVersion() {
        return version;
    }

    public void setVersion(Version version) {
        this.version = version;
    }

    public DatabaseServer getDatabaseServer() {
        return databaseServer;
    }

    public void setDatabaseServer(DatabaseServer databaseServer) {
        this.databaseServer = databaseServer;
    }


    public List<DatabaseSID> getDatabaseSIDs() {
        return databaseSIDs;
    }

    public void setDatabaseSIDs(List<DatabaseSID> databaseSIDs) {
        this.databaseSIDs = databaseSIDs;
    }
}
