package com.kevinjanvier.admissionservice.model;

import java.util.List;

public class DiseasesList {
    private List<Disease> diseases;

    public DiseasesList(List<Disease> diseases) {
        this.diseases = diseases;
    }

    public List<Disease> getDiseases() {
        return diseases;
    }
}
