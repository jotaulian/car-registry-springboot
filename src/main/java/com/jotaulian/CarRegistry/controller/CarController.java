package com.jotaulian.CarRegistry.controller;

import com.jotaulian.CarRegistry.service.CarService;
import com.jotaulian.CarRegistry.service.impl.CarServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@Slf4j
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/cars")
    public ResponseEntity<?> getCar(){
        log.info("Has accedido a la aplicación Car Registry.");
        carService.getCar();

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
