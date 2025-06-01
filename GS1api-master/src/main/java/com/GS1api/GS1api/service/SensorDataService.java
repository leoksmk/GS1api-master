package com.GS1api.GS1api.service;

import com.GS1api.GS1api.model.SensorData;
import com.GS1api.GS1api.repository.SensorDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;

@Service
public class SensorDataService {
    @Autowired
    private SensorDataRepository repository;

    // Simula a leitura de dados do sensor
    public SensorData readSensorData() {
        SensorData data = new SensorData();
        Random random = new Random();
        data.setWaterLevel(random.nextDouble() * 10); // Nível da água entre 0 e 10 metros
        data.setWeatherCondition(random.nextBoolean() ? "Chuva" : "Ensolarado");
        data.setTimestamp(LocalDateTime.now());
        return repository.save(data);
    }

    public List<SensorData> getAllSensorData() {
        return repository.findAll();
    }
}