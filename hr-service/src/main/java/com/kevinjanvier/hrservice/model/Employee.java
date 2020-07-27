package com.kevinjanvier.hrservice.model;

public class Employee {
    private String id;
    private String fistname;
    private String lastname;
    private String speciality;

    public Employee(String id, String fistname, String lastname, String speciality) {
        this.id = id;
        this.fistname = fistname;
        this.lastname = lastname;
        this.speciality = speciality;
    }

    public String getId() {
        return id;
    }

    public String getFistname() {
        return fistname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getSpeciality() {
        return speciality;
    }
}
