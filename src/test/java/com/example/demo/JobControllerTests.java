package com.example.demo;

import com.example.demo.controllers.JobController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class JobControllerTests {

    @Autowired
    JobController jobController;

    @Test
    void health() {
        assert "UP".equals(jobController.healthEndpoint());
    }

}
