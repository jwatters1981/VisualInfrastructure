package com.watters.infrastructure.controller;

import com.watters.infrastructure.model.Server;

/**
 * Created by johnwatters on 26/05/2016.
 */
public class ServerDTO {

    private String name;

    private String ipAddress;

    private String environmentName;
    private String osName;
    private String osVersion;

    public ServerDTO(Server server)
    {
        this.setName(server.getName());
        this.setIpAddress(server.getIpAddress());
        this.setEnvironmentName(server.getEnvironment().getName());
        this.setOsName(server.getOperatingSystem().getName());
        this.setOsVersion(server.getOperatingSystem().getVersion().getVersionName());
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

    public String getEnvironmentName() {
        return environmentName;
    }

    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }


    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }
}
