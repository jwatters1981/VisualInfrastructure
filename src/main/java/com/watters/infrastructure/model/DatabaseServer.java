package com.watters.infrastructure.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by johnwatters on 07/05/2016.
 */
@Entity
@Table(name = "DATABASE_SERVER")
@PrimaryKeyJoinColumn(name="ID")
public class DatabaseServer extends Server implements Serializable {



    @OneToMany(fetch = FetchType.LAZY,mappedBy = "databaseServer")
    private List<Database> databases = new ArrayList<Database>();

    public List<Database> getDatabases() {
        return databases;
    }

    public void setDatabases(List<Database> databases) {
        this.databases = databases;
    }
}
