package com.example.demo2.service;

import org.springframework.http.ResponseEntity;

import com.example.demo2.model.ModelPatients;
import com.example.demo2.response.HabeasResponseRest;
import com.example.demo2.response.PatientsResponseRest;

public interface IPatientsService {

    public ResponseEntity<PatientsResponseRest> RegisterPatients(ModelPatients patients);
    public ResponseEntity<HabeasResponseRest> ShowHabeas();

}
