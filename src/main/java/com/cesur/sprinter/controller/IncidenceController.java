package com.cesur.sprinter.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cesur.sprinter.models.Incidence;
import com.cesur.sprinter.models.dto.incidenceDto;
import com.cesur.sprinter.services.incidenceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api")
public class IncidenceController {

    @Autowired
    incidenceService IncidenceService;

    @PostMapping("/incidence")
    public ResponseEntity<Integer> postMethodName(@RequestBody incidenceDto entity) {
        //TODO: process POST request
        try {
            return new ResponseEntity<Integer>(body:1, HttpStatus.ACCEPTED);
        } catch (Exception e) {
            return new ResponseEntity<Integer>(body:0, HttpStatus.BAD_REQUEST);
        }
        
    }
}

