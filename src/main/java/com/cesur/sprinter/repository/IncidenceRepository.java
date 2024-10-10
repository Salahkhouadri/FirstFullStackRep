package com.cesur.sprinter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cesur.sprinter.models.Incidence;

@Repository
public interface IncidenceRepository extends JpaRepository<Incidence, Long>{
    
}
