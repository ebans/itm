package com.example.demo2.response;

public class PatientsResponseRest extends ResponseRest {
    private PatientsResponse patients = new PatientsResponse();

    public PatientsResponse getPatients() {
        return patients;
    }

    public void setPatients(PatientsResponse patients) {
        this.patients = patients;
    }

  
    
}
