package com.example.demo.dao;

import com.example.demo.dto.Vehicle;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Repository
public class VehicleDAO {

    private final NamedParameterJdbcTemplate namedJdbcTemplate;


    public Vehicle createVehicle(Vehicle vehicle) {
        return new Vehicle();
    }

    public Vehicle getVehicleByRegistrationNo(String regNo) {
        return new Vehicle();
    }
}

