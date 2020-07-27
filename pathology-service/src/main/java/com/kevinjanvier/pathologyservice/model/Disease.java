package com.kevinjanvier.pathologyservice.model;

public class Disease {
    private String id;
    private String description;
    private String treatment;

    public Disease(String id, String description, String treatment) {
        this.id = id;
        this.description = description;
        this.treatment = treatment;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getTreatment() {
        return treatment;
    }
}
