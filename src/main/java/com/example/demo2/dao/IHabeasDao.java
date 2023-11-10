package com.example.demo2.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo2.model.ModelHabeas;

public interface IHabeasDao extends CrudRepository<ModelHabeas, Long> {
    
}
