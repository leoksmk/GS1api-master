package com.GS1api.GS1api.controler;

import com.GS1api.GS1api.model.SensorData;
import com.GS1api.GS1api.service.SensorDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sensors")
public class SensorDataController {
    @Autowired
    private SensorDataService service;

    @GetMapping
    public List<SensorData> getAllSensorData() {
        return service.getAllSensorData();
    }

    @PostMapping
    public SensorData readSensorData() {
        return service.readSensorData();
    }
}