package com.jotaulian.CarRegistry.repository.impl;

import com.jotaulian.CarRegistry.model.Car;
import com.jotaulian.CarRegistry.repository.CarRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Repository
@Slf4j
public class CarRepositoryImpl implements CarRepository {



    @Override
    public void getCar() {
        Car car = new Car();
        car.setBrand("Renault");
        car.setModel("Megane");
        car.setYear(2022);

        log.info("Car brand {}, model {}, year{}", car.getBrand(), car.getModel(), car.getYear());
    }
}
