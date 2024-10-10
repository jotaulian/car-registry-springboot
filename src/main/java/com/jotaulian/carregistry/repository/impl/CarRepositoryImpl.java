package com.jotaulian.carregistry.repository.impl;

import com.jotaulian.carregistry.model.Car;
import com.jotaulian.carregistry.repository.CarRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Repository
@Slf4j
public class CarRepositoryImpl implements CarRepository {



    @Override
    public void getCar() {
        Car car = new Car();
        car.setBrand("Peugeot");
        car.setModel("208 gt");
        car.setYear(2023);

        log.info("Car brand {}, model {}, year {}", car.getBrand(), car.getModel(), car.getYear());
    }
}
