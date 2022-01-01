package com.example.demo.dao;

import com.example.demo.dto.Job;

import org.springframework.stereotype.Repository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Repository
public class JobDAO {

    public Job createJob(Job job, Long customerDbId, Long vehicleDbId) {
        return new Job();
    }
}
