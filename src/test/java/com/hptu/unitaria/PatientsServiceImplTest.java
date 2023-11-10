package com.hptu.unitaria;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.example.demo2.dao.IHabeasDao;
import com.example.demo2.model.ModelHabeas;
import com.example.demo2.response.HabeasResponseRest;
import com.example.demo2.service.PatientsServiceImpl;

public class PatientsServiceImplTest {

    @InjectMocks
    PatientsServiceImpl service;

    @Mock
    IHabeasDao habeasDao;

    @BeforeEach
    public void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testShowHabeas_SuccessfulResponse() {
        List<ModelHabeas> habeasList = new ArrayList<>();
        //habeasList.add(new ModelHabeas(1, "Descripción de prueba 1"));

        when(habeasDao.findAll()).thenReturn(habeasList);

        ResponseEntity<HabeasResponseRest> responseEntity = service.ShowHabeas();

        verify(habeasDao, times(1)).findAll();

        assertNotNull(responseEntity);
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());

        HabeasResponseRest responseBody = responseEntity.getBody();
        assertNotNull(responseBody);
        assertEquals(habeasList, responseBody.getHabeas().getHabeas());
    }

  
}
