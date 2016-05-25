package com.watters.infrastructure.controller;

import com.watters.infrastructure.model.Environment;

import java.io.Serializable;

/**
 * Created by johnwatters on 08/05/2016.
 */
public class EnvBean implements Serializable{

    private Environment environment;

    private int numberOfServers = 0;

    public EnvBean(Environment environment) {
        this.environment = environment;
    }

    public String getDescription()
    {
        return environment.getDescription();
    }

    public String getName()
    {
        return environment.getName();
    }

    public int getNumberOfServers() {
        return numberOfServers;
    }

    public void setNumberOfServers(int numberOfServers) {
        this.numberOfServers = numberOfServers;
    }
}
