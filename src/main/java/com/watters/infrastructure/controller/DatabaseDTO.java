package com.watters.infrastructure.controller;

import com.watters.infrastructure.model.Database;

/**
 * Created by johnwatters on 26/05/2016.
 */
public class DatabaseDTO {

    private String name;

    private String serverName;

    public DatabaseDTO(Database database)
    {
        this.setName(database.getName());
        this.setServerName(database.getDatabaseServer().getName());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }
}
