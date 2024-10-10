package com.jotaulian.CarRegistry.service.impl;

import com.jotaulian.CarRegistry.repository.CarRepository;
import com.jotaulian.CarRegistry.service.CarService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CarServiceImpl implements CarService {

    @Value("${property.name}")
    private String name;

    @Autowired
    private CarRepository carRepository;

    @Override
    public void getCar() {
        log.info("The value of property.name is: {}",name);
        carRepository.getCar();
    }
}
