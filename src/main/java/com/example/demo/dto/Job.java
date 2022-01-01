package com.example.demo.dto;

import lombok.Data;

@Data
public class Job {
    private Long jobDbId;
    private Customer customer;
    private Vehicle vehicle;
    private String repairNote;
    private String technicianName;
}
