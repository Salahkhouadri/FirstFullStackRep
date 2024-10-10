package com.cesur.sprinter.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cesur.sprinter.models.dto.incidenceDto;

@Service
public interface incidenceService {
    List<incidenceDto> getIncidenceById(Long id);
    List<incidenceDto> getIncidenceByUser(String userName);
    void storeIncidence(incidenceDto datos);
    void deleteIndidence(Long id);
}
