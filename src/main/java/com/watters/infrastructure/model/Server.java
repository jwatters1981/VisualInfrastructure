package com.watters.infrastructure.model;

import javax.persistence.*;

/**
 * Created by johnwatters on 07/05/2016.
 */
@Entity
@Table(name = "SERVER")
@Inheritance(strategy= InheritanceType.JOINED)
public class Server {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;

    @Column(name = "SERVER_NAME")
    private String name;

    @Column(name = "IP_ADDRESS")
    private String ipAddress;

    @Column(name = "VERSION_ID")
    private Version version;

    @ManyToOne
    @JoinColumn(name = "ENVIRONMENT_ID")
    private Environment environment;



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

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public Version getVersion() {
        return version;
    }

    public void setVersion(Version version) {
        this.version = version;
    }

    public Environment getEnvironment() {
        return environment;
    }

    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }


}
