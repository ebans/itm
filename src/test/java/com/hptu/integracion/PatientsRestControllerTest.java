package com.hptu.integracion;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

import com.example.demo2.Demo2Application;
import com.example.demo2.model.ModelPatients;
import com.example.demo2.response.PatientsResponseRest;

@SpringBootTest(classes = Demo2Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PatientsRestControllerTest {
    
    @LocalServerPort
    private int port;
    
    @Autowired
    private TestRestTemplate restTemplate;
    
    @Test
    public void testCreatePatients() {
        ModelPatients patients = new ModelPatients();
        patients.setPatientDocument("12345");
        patients.setPatientDocumentType("CC");
        patients.setPatientDocumentDate("01/01/2000");
        patients.setPatientFirstName("Ebans");
        patients.setPatientSecondName("Joseph");
        patients.setPatientFirstLastName("Doe");
        patients.setPatientStatus("Soltero");
        patients.setPatientMobilePhone("1234567");
        patients.setPatientEmail("ebans@gmail.com");
        patients.setPatientResponsibleName("Caroline");
        patients.setPatientResponsibleLastName("Falconi");
        patients.setPatientResponsiblePhone("99999");
        patients.setPatientRelationship("Madre");
        patients.setPatientSocialSecurityNumber("nn");
        patients.setPatientMotherName("Caroline Falconi");
        patients.setPatientAddress("Cra 1");
        patients.setPatientPhoneNumber("111111");

        ResponseEntity<PatientsResponseRest> response = restTemplate.postForEntity(
                "http://localhost:" + port + "/itmEspecializacion/registerPatients",
                patients, PatientsResponseRest.class);

        assertThat(response).isNotNull();
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody()).isNotNull();

        PatientsResponseRest createdPatient = response.getBody();

        assertThat(createdPatient.getPatients()).isNotNull();
        assertThat(createdPatient.getPatients().getPatients()).hasSize(1);

        ModelPatients createdPatientData = createdPatient.getPatients().getPatients().get(0);
        assertThat(createdPatientData.getPatientDocument()).isEqualTo("12345");
        System.out.println("Patient Document: " + createdPatientData.getPatientDocument());

        assertThat(createdPatientData.getPatientDocumentType()).isEqualTo("CC");
        assertThat(createdPatientData.getPatientDocumentDate()).isEqualTo("01/01/2000");
        assertThat(createdPatientData.getPatientFirstName()).isEqualTo("Ebans");
        assertThat(createdPatientData.getPatientSecondName()).isEqualTo("Joseph");
        assertThat(createdPatientData.getPatientFirstLastName()).isEqualTo("Doe");
        assertThat(createdPatientData.getPatientStatus()).isEqualTo("Soltero");
        assertThat(createdPatientData.getPatientMobilePhone()).isEqualTo("1234567");
        assertThat(createdPatientData.getPatientEmail()).isEqualTo("ebans@gmail.com");
        assertThat(createdPatientData.getPatientResponsibleName()).isEqualTo("Caroline");
        assertThat(createdPatientData.getPatientResponsibleLastName()).isEqualTo("Falconi");
        assertThat(createdPatientData.getPatientResponsiblePhone()).isEqualTo("99999");
        assertThat(createdPatientData.getPatientRelationship()).isEqualTo("Madre");
        assertThat(createdPatientData.getPatientSocialSecurityNumber()).isEqualTo("nn");
        assertThat(createdPatientData.getPatientMotherName()).isEqualTo("Caroline Falconi");
        assertThat(createdPatientData.getPatientAddress()).isEqualTo("Cra 1");
        assertThat(createdPatientData.getPatientPhoneNumber()).isEqualTo("111111");
    }
}
