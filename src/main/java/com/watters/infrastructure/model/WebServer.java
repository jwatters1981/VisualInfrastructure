package com.watters.infrastructure.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by johnwatters on 07/05/2016.
 */
@Entity
@Table(name = "WEB_SERVER")
@PrimaryKeyJoinColumn(name="ID")
public class WebServer extends Server implements Serializable{


    @OneToMany(fetch = FetchType.LAZY,targetEntity = ApplicationServer.class)
    private List<ApplicationServer> applicationServers = new ArrayList<ApplicationServer>();


    public List<ApplicationServer> getApplicationServers() {
        return applicationServers;
    }

    public void setApplicationServers(List<ApplicationServer> applicationServers) {
        this.applicationServers = applicationServers;
    }
}
