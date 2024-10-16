package org.MicroRabbitMq.controller;

import org.MicroRabbitMq.dto.DtoUser;
import org.MicroRabbitMq.service.ServiceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ControllerUser {

    @Autowired
    private ServiceUser serviceUser;

    @PostMapping("/save")
    ResponseEntity<?> registrar(DtoUser dtoUser){
        serviceUser.save(dtoUser);
        return ResponseEntity.ok().build();
    }
}
