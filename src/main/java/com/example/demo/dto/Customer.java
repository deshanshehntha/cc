package com.example.demo.dto;

import lombok.Data;

@Data
public class Customer {
    private Long customerDbId;
    private String customerName;
    private String contactNumber;
    private String email;
}
