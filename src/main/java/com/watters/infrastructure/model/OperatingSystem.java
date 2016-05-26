package com.watters.infrastructure.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by johnwatters on 26/05/2016.
 */
@Entity
@Table(name = "OPERATING_SYS")
public class OperatingSystem implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "OS_NAME")
    private String name;

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

    public Version getVersion() {
        return version;
    }

    public void setVersion(Version version) {
        this.version = version;
    }
}
