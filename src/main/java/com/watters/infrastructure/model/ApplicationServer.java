package com.watters.infrastructure.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by johnwatters on 07/05/2016.
 */
@Entity
@Table(name = "APPLICATION_SERVER")
@PrimaryKeyJoinColumn(name="ID")
public class ApplicationServer extends Server implements Serializable{


    @OneToMany(fetch = FetchType.LAZY, targetEntity = Application.class)
    private List<Application> applications = new ArrayList<Application>();

    public List<Application> getApplications() {
        return applications;
    }

    public void setApplications(List<Application> applications) {
        this.applications = applications;
    }
}
