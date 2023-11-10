package com.example.demo2.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo2.model.ModelPatients;

public interface IPatientsDao extends CrudRepository<ModelPatients, Long> {

}
