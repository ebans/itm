package com.example.demo2.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_registros_pacientes")
public class ModelPatients implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "patientDocument")
    private String patientDocument;

    @Column(name = "patientDocumentType")
    private String patientDocumentType;

    @Column(name = "patientDocumentDate")
    private String patientDocumentDate;

    @Column(name = "patientFirstName")
    private String patientFirstName;

    @Column(name = "patientSecondName")
    private String patientSecondName;

    @Column(name = "patientFirstLastName")
    private String patientFirstLastName;

    @Column(name = "patientSecondLastName")
    private String patientSecondLastName;

    @Column(name = "patientStatus")
    private String patientStatus;

    @Column(name = "patientMobilePhone")
    private String patientMobilePhone;

    @Column(name = "patientEmail")
    private String patientEmail;

    @Column(name = "patientResponsibleName")
    private String patientResponsibleName;

    @Column(name = "patientResponsibleLastName")
    private String patientResponsibleLastName;

    @Column(name = "patientResponsiblePhone")
    private String patientResponsiblePhone;

    @Column(name = "patientRelationship")
    private String patientRelationship;

    @Column(name = "patientSocialSecurityNumber")
    private String patientSocialSecurityNumber;

    @Column(name = "patientMotherName")
    private String patientMotherName;

    @Column(name = "patientAddress")
    private String patientAddress;

    @Column(name = "patientPhoneNumber")
    private String patientPhoneNumber;

  

      @Column(name = "patientDocumentExpDate")
    private String patientDocumentExpDate;

       @Column(name = "status")
    private String status;

    

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPatientDocumentExpDate() {
        return patientDocumentExpDate;
    }

    public void setPatientDocumentExpDate(String patientDocumentExpDate) {
        this.patientDocumentExpDate = patientDocumentExpDate;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPatientDocument() {
        return patientDocument;
    }

    public void setPatientDocument(String patientDocument) {
        this.patientDocument = patientDocument;
    }

    public String getPatientDocumentType() {
        return patientDocumentType;
    }

    public void setPatientDocumentType(String patientDocumentType) {
        this.patientDocumentType = patientDocumentType;
    }

    public String getPatientDocumentDate() {
        return patientDocumentDate;
    }

    public void setPatientDocumentDate(String patientDocumentDate) {
        this.patientDocumentDate = patientDocumentDate;
    }

    public String getPatientFirstName() {
        return patientFirstName;
    }

    public void setPatientFirstName(String patientFirstName) {
        this.patientFirstName = patientFirstName;
    }

    public String getPatientSecondName() {
        return patientSecondName;
    }

    public void setPatientSecondName(String patientSecondName) {
        this.patientSecondName = patientSecondName;
    }

    public String getPatientFirstLastName() {
        return patientFirstLastName;
    }

    public void setPatientFirstLastName(String patientFirstLastName) {
        this.patientFirstLastName = patientFirstLastName;
    }

    public String getPatientSecondLastName() {
        return patientSecondLastName;
    }

    public void setPatientSecondLastName(String patientSecondLastName) {
        this.patientSecondLastName = patientSecondLastName;
    }

    public String getPatientStatus() {
        return patientStatus;
    }

    public void setPatientStatus(String patientStatus) {
        this.patientStatus = patientStatus;
    }

    public String getPatientMobilePhone() {
        return patientMobilePhone;
    }

    public void setPatientMobilePhone(String patientMobilePhone) {
        this.patientMobilePhone = patientMobilePhone;
    }

    public String getPatientEmail() {
        return patientEmail;
    }

    public void setPatientEmail(String patientEmail) {
        this.patientEmail = patientEmail;
    }

    public String getPatientResponsibleName() {
        return patientResponsibleName;
    }

    public void setPatientResponsibleName(String patientResponsibleName) {
        this.patientResponsibleName = patientResponsibleName;
    }

    public String getPatientResponsibleLastName() {
        return patientResponsibleLastName;
    }

    public void setPatientResponsibleLastName(String patientResponsibleLastName) {
        this.patientResponsibleLastName = patientResponsibleLastName;
    }

    public String getPatientResponsiblePhone() {
        return patientResponsiblePhone;
    }

    public void setPatientResponsiblePhone(String patientResponsiblePhone) {
        this.patientResponsiblePhone = patientResponsiblePhone;
    }

    public String getPatientRelationship() {
        return patientRelationship;
    }

    public void setPatientRelationship(String patientRelationship) {
        this.patientRelationship = patientRelationship;
    }

    public String getPatientSocialSecurityNumber() {
        return patientSocialSecurityNumber;
    }

    public void setPatientSocialSecurityNumber(String patientSocialSecurityNumber) {
        this.patientSocialSecurityNumber = patientSocialSecurityNumber;
    }

    public String getPatientMotherName() {
        return patientMotherName;
    }

    public void setPatientMotherName(String patientMotherName) {
        this.patientMotherName = patientMotherName;
    }

    public String getPatientAddress() {
        return patientAddress;
    }

    public void setPatientAddress(String patientAddress) {
        this.patientAddress = patientAddress;
    }

    public String getPatientPhoneNumber() {
        return patientPhoneNumber;
    }

    public void setPatientPhoneNumber(String patientPhoneNumber) {
        this.patientPhoneNumber = patientPhoneNumber;
    }


    
}
