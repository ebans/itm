package com.example.demo2.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo2.dao.IHabeasDao;
import com.example.demo2.dao.IPatientsDao;
import com.example.demo2.model.ModelHabeas;
import com.example.demo2.model.ModelPatients;
import com.example.demo2.response.HabeasResponseRest;
import com.example.demo2.response.PatientsResponseRest;

@Service
public class PatientsServiceImpl implements IPatientsService {

    private static final Logger log = LoggerFactory.getLogger(PatientsServiceImpl.class);
    @Autowired
    private IPatientsDao patientsDao;
    @Autowired
    private IHabeasDao habeasDao;

   

    @Override
    @Transactional
    public ResponseEntity<PatientsResponseRest> RegisterPatients(ModelPatients patients) {
        log.info("Start of the registerPatient method");
        PatientsResponseRest response = new PatientsResponseRest();
        List<ModelPatients> list = new ArrayList<>();

        try {
            ModelPatients pacienteRegistrar = patientsDao.save(patients);

            if (pacienteRegistrar != null) {
                list.add(pacienteRegistrar);
                response.getPatients().setPatients(list);
            } else {
                log.error("Error while registering the patient");
                response.SetMetadata("Error Response", "403", "Incorrect response");
                return new ResponseEntity<PatientsResponseRest>(response, HttpStatus.BAD_REQUEST);
            }
        } catch (Exception e) {
            response.SetMetadata("Error Response", "500", "Incorrect response");
            log.error("Error in patient registration", e.getMessage());
            e.getStackTrace();
            return new ResponseEntity<PatientsResponseRest>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        response.SetMetadata("response ok", "200", "Successful response");
        return new ResponseEntity<PatientsResponseRest>(response, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<HabeasResponseRest> ShowHabeas() {
        log.info("Start of the search method");
        HabeasResponseRest response = new HabeasResponseRest();

        try {
            List<ModelHabeas> habeas = (List<ModelHabeas>) habeasDao.findAll();
            response.getHabeas().setHabeas(habeas);
            response.SetMetadata("response ok", "200", "Successful response");
        } catch (Exception e) {
            response.SetMetadata("Error Response", "500", "Incorrect response");
            log.error("Error while querying habeas data terms", e);
            e.getStackTrace();
            return new ResponseEntity<HabeasResponseRest>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<HabeasResponseRest>(response, HttpStatus.OK);
    }
}
