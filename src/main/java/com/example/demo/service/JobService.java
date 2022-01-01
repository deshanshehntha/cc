package com.example.demo.service;

import com.example.demo.dao.CustomerDAO;
import com.example.demo.dao.JobDAO;
import com.example.demo.dao.VehicleDAO;
import com.example.demo.dto.Customer;
import com.example.demo.dto.Job;
import com.example.demo.dto.Vehicle;

import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class JobService {

    private final VehicleDAO vehicleDAO;
    private final CustomerDAO customerDAO;
    private final JobDAO jobDAO;

    public Job createJob(Job job) {
        if(!isCompulsoryJobDetailsExists(job)) {
            return null;
        }

        Vehicle vehicle =
            vehicleDAO.getVehicleByRegistrationNo(job.getVehicle().getVehicleRegistrationNumber());

        if(vehicle == null) {
            vehicle = vehicleDAO.createVehicle(job.getVehicle());
        }

        Customer customer = customerDAO.getCustomerByName(job.getCustomer().getCustomerName());
        if(customer == null) {
            customer = customerDAO.createCustomer(job.getCustomer());
        }

        return jobDAO.createJob(job, vehicle.getVehicleDbId(), customer.getCustomerDbId());
    }

    private boolean isCompulsoryJobDetailsExists(Job job) {
        if (job.getCustomer().getCustomerName() == null
            || job.getCustomer().getCustomerName().isEmpty()) {
            return false;
        }

        if (job.getVehicle().getVehicleRegistrationNumber() == null
            || job.getVehicle().getVehicleRegistrationNumber().isEmpty()) {
            return false;
        }

        if(job.getRepairNote() == null || job.getRepairNote().isEmpty()) {
            return false;
        }

        return true;
    }

}
