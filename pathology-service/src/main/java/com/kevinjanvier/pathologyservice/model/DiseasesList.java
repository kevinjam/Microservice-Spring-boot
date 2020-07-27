package com.kevinjanvier.pathologyservice.model;

import java.util.List;

public class DiseasesList {
    private List<Disease> disease;

    public DiseasesList() {
    }

    public DiseasesList(List<Disease> disease) {
        this.disease = disease;
    }

    public List<Disease> getDisease() {
        return disease;
    }

    public void setDisease(List<Disease> disease) {
        this.disease = disease;
    }
}
