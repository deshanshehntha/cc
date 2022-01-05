package com.example.demo.controllers;

import com.example.demo.dto.Customer;
import com.example.demo.dto.Job;
import com.example.demo.service.JobService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/v1/job")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class JobController {

    private final JobService jobService;

    @PostMapping()
    public ResponseEntity createNewJob(@RequestBody Job job) {
        Job createdJob = jobService.createJob(job);
        if(createdJob == null) {
            return ResponseEntity.badRequest().build();
        } else {
            return ResponseEntity.ok(createdJob);
        }
    }

    @GetMapping()
    public String healthEndpoint() {
        return "UP";
    }

    @GetMapping("/{id}")
    public Job getJobById(@PathVariable Long id) {
        Job job = new Job();

        job.setJobDbId(id);
        Customer customer = new Customer();
        customer.setCustomerDbId(10L);
        customer.setCustomerName("John Cena");
        
        job.setCustomer(customer);
        job.setRepairNote("Removing gear oil");
        return job;
    }
}
