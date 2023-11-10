package com.example.demo2.response;

import java.util.*;

import com.example.demo2.model.ModelPatients;

public class PatientsResponse {

    private List<ModelPatients> patients;

    public List<ModelPatients> getPatients() {
        return patients;
    }

    public void setPatients(List<ModelPatients> patients) {
        this.patients = patients;
    }

}
