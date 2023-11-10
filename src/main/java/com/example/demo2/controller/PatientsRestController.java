package com.example.demo2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo2.model.ModelPatients;
import com.example.demo2.response.HabeasResponseRest;
import com.example.demo2.response.PatientsResponseRest;
import com.example.demo2.service.IPatientsService;

@RestController
@RequestMapping("/itmEspecializacion")
public class PatientsRestController {

    @Autowired
    private IPatientsService services;

   

    @PostMapping("/registerPatients")
    public ResponseEntity<PatientsResponseRest> registrarPatients(@RequestBody ModelPatients request) {
        ResponseEntity<PatientsResponseRest> response = services.RegisterPatients(request);
        return response;
    }

    @GetMapping("/habeas")
    public ResponseEntity<HabeasResponseRest> showHabeas() {
        ResponseEntity<HabeasResponseRest> response = services.ShowHabeas();
        return response;
    }
}
