package org.MicroRabbitMq.controller;

import org.MicroRabbitMq.dto.DtoCarrrera;
import org.MicroRabbitMq.service.ServiceCarrera;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ControllerCarrera {

    @Autowired
    private ServiceCarrera serviceCarrera;

    @PostMapping("/save")
    ResponseEntity<?> registrar(DtoCarrrera dtoCarrrera){
        serviceCarrera.save(dtoCarrrera);
        return ResponseEntity.ok().build();
    }
}
