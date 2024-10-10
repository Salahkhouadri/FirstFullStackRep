package com.cesur.sprinter.services.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cesur.sprinter.models.Incidence;
import com.cesur.sprinter.models.dto.incidenceDto;
import com.cesur.sprinter.repository.IncidenceRepository;
import com.cesur.sprinter.services.incidenceService;

public class IncidenceServiceImpl implements incidenceService {
    @Autowired
    private IncidenceRepository incidenceRepository;
    @Override
    public List<incidenceDto> getIncidenceById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getIncidenceById'");
    }

    @Override
    public List<incidenceDto> getIncidenceByUser(String userName) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getIncidenceByUser'");
    }

    @Override
    public void storeIncidence(incidenceDto datos) {

        Incidence incidence = new Incidence();
        incidence.setCategory(datos.getCategory());
        incidence.setDescription(datos.getDescription());
        incidence.setPriority(datos.getPriority());
        incidence.setCreatedAt(LocalDateTime.now());
        incidence.setCreatedUser(null);

        incidenceRepository.save(incidence);
    }

    @Override
    public void deleteIndidence(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteIndidence'");
    }
    
}
