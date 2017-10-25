package com.mcylm.microservice.mission.service.utils;

public class ServiceStatus {

    private String name;
    private String version;
    private String author;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public ServiceStatus(String name, String version, String author) {
        this.name = name;
        this.version = version;
        this.author = author;
    }
}
