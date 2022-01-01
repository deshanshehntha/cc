package com.example.demo.dto;

import lombok.Data;

@Data
public class Vehicle {
    private Long vehicleDbId;
    private String vehicleRegistrationNumber;
    private String vehicleModel;
    private Double mileage;
}
