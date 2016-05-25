package com.watters.infrastructure.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by johnwatters on 07/05/2016.
 * Model to hold all versions of software and hardware
 * used
 */
@Entity
@Table(name = "COMPONENT_VERSION")
public class Version  implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "VERSION_NAME")
    private String versionName;

    @Column(name = "VERSION_DATE")
    @Temporal(TemporalType.DATE)
    private Date versionDate;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public Date getVersionDate() {
        return versionDate;
    }

    public void setVersionDate(Date versionDate) {
        this.versionDate = versionDate;
    }
}
