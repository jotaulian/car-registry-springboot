package com.jotaulian.CarRegistry.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    private String brand;
    private String model;
    private Integer year;


}
