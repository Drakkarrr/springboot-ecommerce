package com.store.store.controller;

import com.store.store.entity.IncidentsEntity;
import com.store.store.repository.IncidentsRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IncidentsController {

    private final IncidentsRepository incidentsRepository;

    public IncidentsController(IncidentsRepository incidentsRepository) {
        this.incidentsRepository = incidentsRepository;
    }

    @PostMapping("/incidents")
    public IncidentsEntity createIncidents(@RequestBody IncidentsEntity incidentsEntity) {
        return incidentsRepository.save(incidentsEntity);
    }
}
